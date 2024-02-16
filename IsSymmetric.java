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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        /*
            so here the left and right nodes should equal and
            left's left node and right's right node should equal and 
            left's right node and right's left node should be equal 
        */
        
        if( root == null )
        {
            return true;
        }
        return helper( root.left, root.right );
    }
    public static boolean helper( TreeNode left, TreeNode right )
    {
        if( left == null && right == null )
        {
            return true;
        }

        if( left == null || right == null || left.val != right.val )
        {
            return false;
        }
        boolean leftVal = helper( left.left , right.right );
        boolean rightVal = helper( left.right , right.left );

        return leftVal & rightVal;
    }
}