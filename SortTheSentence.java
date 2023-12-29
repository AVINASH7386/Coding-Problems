class SortTheSentence {
    public String sortSentence(String s) {

        // Split string with space
        String[] givenString = s.split(" ");
        String[] result = new String[givenString.length];
        String res = "";
        // runa loop for string array to get index and exact string
        for( int i = 0; i < givenString.length; i++)
        {
            String currentString = givenString[i];
            // index , as last value will be in character substracting with 0 and cnverting to int
            int index =(int) currentString.charAt(currentString.length()-1)-'0';
            // creating substring excluding index value
            String resultString = currentString.substring(0,currentString.length()-1);
            // modifying result array with index and exact string
            result[index-1] = resultString;
        }
        // running a loop to return as string
        for( int i = 0; i < result.length; i++)
        {
            if( i == 0)
            {
                res = result[i];
            }
            else
            {
            res = res + " " + result[i];
            }   
        }
        return res;
    }
}