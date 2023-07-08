class MinStack {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();
    
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty())
        {
            minStack.push(val);
        }else{
            boolean isValueToBeInsertedLowerThanExisting = val < minStack.peek();
            if(isValueToBeInsertedLowerThanExisting)
                minStack.push(val);
            else
                minStack.push(minStack.peek());
        }
        
    }
    
    public void pop() {
      //  if(stack.isEmpty()) // Throw Exception
            stack.pop();
            minStack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        return stack.peek();

    }
    
    public int getMin() {
        if(minStack.isEmpty())
            return -1;
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */