class MaxPairsofKSum {
    public int maxOperations(int[] nums, int k) {

        // Sorting given array
        Arrays.sort(nums);
        int count = 0;
        int s = 0;
        int e = nums.length-1;
        // run a while loop until we start less than end 
        while ( s < e)
        {
            // if we found the required sum then we can increase the sum
            if(nums[s] + nums[e] == k)
            {
                count++;
                s++;
                e--;
            }
            // current sum is greater than k we can decrease end cause towards rear end we will be having maximum values
            else if( nums[s] + nums[e] > k)
            {
                e--;
            }
            // else we can increase start
            else
            {
                s++;
            }
        }
        // we can return count
        return count;
    }
}