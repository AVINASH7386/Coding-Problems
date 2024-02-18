class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        // We have given string A and string B, we should make String A multiple times so that string b is substring of added string.

        StringBuilder sb = new StringBuilder(a);
        for( int i = 0; i < ( b.length() / a.length() ) + 2 ; i++)
        {
            if( sb.toString().contains(b))
            {
                return i + 1;
            }
            else
            {
                sb.append(a);
            }
        }
        return -1;
    }
}