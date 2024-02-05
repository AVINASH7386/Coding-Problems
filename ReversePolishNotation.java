class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int n1 = 0, n2 = 0;
        for( int i = 0; i < tokens.length; i++)
        {
            if( tokens[i].equals("+") )
            {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 + n2);
            }
            else if( tokens[i].equals("-") )
            {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 - n2);
            }
            else if( tokens[i].equals("*") )
            {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 * n2);
            }
            else if( tokens[i].equals("/" ))
            {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 / n2);
            }
            else
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}