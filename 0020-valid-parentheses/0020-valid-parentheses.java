class Solution {
    public boolean isValid(String s) {
            if(s.length() % 2 != 0)
                return false;
        
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i< s.length();i++)
        {
            char foundChar = s.charAt(i);
            if(foundChar == '(' || foundChar == '{' || foundChar == '[')
            {
                stack.push(foundChar);
            }else{ // Closing Phase
                if(stack.isEmpty())
                {
                    return false;
                }else{
                    Character charAtPeek = stack.peek();
                    if((charAtPeek == '(' && foundChar == ')') 
                       || (charAtPeek == '{' && foundChar == '}') 
                       || (charAtPeek == '[' && foundChar == ']'))
                    {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
            
        }
        
        
        
        return stack.isEmpty();
        }
}