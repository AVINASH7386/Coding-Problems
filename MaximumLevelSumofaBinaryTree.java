/**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
 */
class MaximumLevelSumofaBinaryTree {
    public int maxLevelSum(TreeNode root) {

        int maxLevel = 0;
        int maxLevelSum = Integer.MIN_VALUE;
        int currentLevel = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        // adding root node to the queue
        queue.offer(root);

        // traversing until queue becomes empty
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            int levelSum = 0;
            // adding left and right node for every TreeNode
            for( int i = 0; i < levelSize; i++)
            {
                TreeNode currentNode = queue.poll();
                if( currentNode.left != null)
                {
                    queue.offer(currentNode.left);
                }
                if( currentNode.right != null)
                {
                    queue.offer(currentNode.right);
                }
                levelSum += currentNode.val;
            }
            currentLevel++;
            // checking if its maximum sum or not, if not modifying it accordingly
            if(levelSum > maxLevelSum)
            {
                maxLevelSum = levelSum;
                maxLevel = currentLevel;
            }
        }
        // returning level of maxsum of all node for a level
        return maxLevel;
    }
}