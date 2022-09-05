class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1)
            return false;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i =0; i < s.length(); i++)
        {
            Character chr = s.charAt(i);
            if(chr == '(' || chr == '{' || chr == '[') stack.push(chr);
            else{
                if(stack.isEmpty()) return false; // Expecting Right Closing Bracket Not Empty
     else{
         Character top = stack.peek();
 if((top == '(' && chr == ')') || (top == '{'  && chr == '}') || (top == '[' &&  chr == ']')) {
                stack.pop();
      }else return false;
                }
            }
        }
        return stack.isEmpty();
        }
}