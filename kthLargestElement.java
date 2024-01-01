public class kthLargestElement {
    public int findKthLargest(int[] nums, int k) {

        // Declaring max heap
        PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        // traversing through all elements of array
        for( int i = 0; i < nums.length; i++)
        {
            pqueue.add(nums[i]);
        }

        int n = 0;
        // removing k-1 elements from array
        while( n < k - 1)
        {
            pqueue.poll();
            n++;
        }
        // returning kth largest element.
        return pqueue.poll();
    }
}
