class Solution {
    public String longestPalindrome(String s) {
        
        String res = "";
        for( int i = 0; i < s.length(); i++)
        {
            for( int j = i + 1; j <= s.length(); j++)
            {
                String temp = s.substring(i,j);
                if( isPalindrome(temp) )
                {
                    if( res.length() < temp.length() )
                    {
                        res = temp;
                    }
                }
            }
        }
        return res;
    }
    public static boolean isPalindrome(String str)
    {
        if( str.length() == 0)
        {
            return true;
        }
        int s = 0;
        int e = str.length()-1;
        while( s < e )
        {
            if( str.charAt(s) != str.charAt(e) )
            {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}