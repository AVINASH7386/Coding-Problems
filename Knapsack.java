import java.util.Arrays;

public class Knapsack{


    public static void main(String[] args) {
        
        int[] arr = {2,3,5,6,7,10};
        int sum = 10;
        System.out.println(CountOfSubsets(arr,sum));
    }

    public static int CountOfSubsets(int[] arr , int sum)
    {

        int count  = 0;

        int[][] t = new int[arr.length+1][sum+1];

        for( int i = 0; i < arr.length+1; i++)
        {
            for( int  j = 0; j < sum + 1; j++)
            {
                if ( i == 0 )
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
            for( int j = 1; j < sum + 1; j++)
            {
                if( arr[i-1] <= j)
                {
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
                // if(t[i][j] == true)
                // {
                //     count++;
                // }
            }
        }

        for( int i = 0; i < t.length; i++)
        {
            System.out.println(Arrays.toString(t[i]));
        }


        return t[arr.length][sum] ;
    }


}