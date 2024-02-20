class Solution {
    public int maxSubArray(int[] nums) {
        
        if( nums.length == 1 )
        {
            return nums[0];
        }
        int maxSum = Integer.MIN_VALUE; 
        /*
            5 4 -1 7 8 
        */
        
        int sum = 0;
        for( int i = 0; i < nums.length; i++)
        {
            if( sum < 0 )
            {
                sum = 0;
            }
            sum = sum + nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}