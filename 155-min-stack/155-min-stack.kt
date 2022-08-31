
class MinStack() {
    val stack: Stack<Int> = Stack<Int>()
    val minStack: Stack<Int> = Stack<Int>()
    
    fun push(value: Int) {
                   stack.push(value);
 if(minStack.isEmpty())
        {
            minStack.push(value)
        }else{
            if(minStack.peek() > value)
            minStack.push(value)
            else
            minStack.push(minStack.peek())
        }
    
    }

    fun pop() {
        if(stack.isEmpty()) // Throw Exception
        else
        {stack.pop()
        minStack.pop()
    }}

    fun top(): Int {
 return if(stack.isEmpty())  -1 else stack.peek()
        
        }

    fun getMin(): Int {
return if(minStack.isEmpty())  -1 else minStack.peek()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */