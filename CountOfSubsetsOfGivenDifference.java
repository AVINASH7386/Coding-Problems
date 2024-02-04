public class CountOfSubsetsOfGivenDifference {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        // 17 / 2 = 8 // 1 , 3 , 4  { 2, 5 }  // 2 , 5 // 3, 5, // 1  2 , 5
        int diff = 2;

        System.out.println(CountDifference(arr,diff));
    }

    public static int CountDifference ( int[] arr, int diff)
    {

        int sum = 0;
        for( int i = 0; i < arr.length ; i++)
        {
            sum += arr[i];
        }

        int resultSum = diff + sum / 2;

        int[][] t = new int[arr.length+1][resultSum+1];

        for( int i = 0; i < arr.length + 1; i++)
        {
            for ( int j = 0; j < resultSum + 1; j++)
            {
                if( i == 0)
                {
                    t[i][j] = 0;
                }
                if( j == 0 )
                {
                    t[i][j] = 1;
                }
            }
        }

        for( int i = 1; i < arr.length + 1; i++)
        {
            for ( int j = 0; j < resultSum + 1; j++)
            {
                if( arr[i-1] <= j)
                {
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }


        return t[arr.length][resultSum];


    }
}
