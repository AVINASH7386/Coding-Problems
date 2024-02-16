/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BottomleftNode {
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        int result = 0;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            for( int i = 0; i < levelSize; i++ )
            {
                TreeNode node = queue.poll();
                if( i == 0 )
                {
                    result = node.val;
                }
                if( node.left != null )
                {
                    queue.offer(node.left);
                }
                if(node.right != null )
                {
                    queue.offer(node.right);
                }
            }
        }
        return result;
    }
}