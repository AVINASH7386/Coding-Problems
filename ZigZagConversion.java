class ZigZagConversion {
    public String convert(String s, int numRows) {
        /*
            0 1 2 3 4 5 6 7 8 9 10 11 12 13
            P A Y P A L I S H I R  I  N  G
            P   A   H   N
            A P L S I I G
            Y   I   R
            P A H N  A P L S I I  G  Y I R
            0 4 8 12 1 3 5 7 9 11 13 2 6 10
            
            0 + 3 + 3 / 2 -> 3 + 1
            4 + 3 + 3 / 2 -> 8
             

            P  
            A   L
            Y A
            P
            0 + 4 + 4 / 2 -> 6
            6 + 4 + 4 / 2 -> 12
        */
        if( s.length() == 1)
        {
            return s;
        }
        int n = s.length();
        StringBuffer[] arr = new StringBuffer[numRows];
        for( int i = 0; i < numRows; i++)
        {
            arr[i] = new StringBuffer();
        }

        int i = 0;
        while( i < n)
        {
            for( int ind = 0; ind < numRows && i < n ; ind++)
            {
                arr[ind].append(s.charAt(i++));
            }
            // System.out.println(Arrays.toString(arr));
            for( int ind = numRows-2; ind > 0 && i < n; ind--)
            {
                arr[ind].append(s.charAt(i++));
                System.out.println(Arrays.toString(arr));
            }
            
        }
        // System.out.println(Arrays.toString(arr));
        StringBuffer ans = new StringBuffer();
        for( StringBuffer el : arr)
        {
            ans.append(el);
        }
        return ans.toString();
    }
}