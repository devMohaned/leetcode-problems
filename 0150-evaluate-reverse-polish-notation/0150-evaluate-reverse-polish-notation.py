class Solution:
    def evalRPN(self, tokens: List[str]) -> int:

        stack = []
        result = 0
        for c in tokens:
            if c not in '+-*/':
                stack.append(int(c))
            else:
                right, left = stack.pop(), stack.pop()
                if (c == '+'):
                    result = left + right
                    stack.append(result)
                elif(c == '-'):
                    result = left - right
                    stack.append(result)
                elif (c == '*'):
                    result = left * right
                    stack.append(result)
                elif(c == '/'):
                    result = int(left / right)
                    stack.append(result)

        return stack.pop()




        