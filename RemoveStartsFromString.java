
class RemoveStarsFromString {
    public String removeStars(String s) {
        // creating stack for manipulation of characters
        Stack<Character> stack = new Stack<>();

        // looping character array
        for( char c : s.toCharArray())
        {
            // if its star we need to remove element from stack 
            if( c == '*')
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            // not need to add element from stack
            else
            {
                stack.push(c);
            }
        }  

        StringBuilder sb = new StringBuilder();
        // once our manipulation operations are done, need to return remaining array 
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}