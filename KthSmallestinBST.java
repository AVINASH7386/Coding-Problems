public class KthSmallestinBST {
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
    public static int number = 0;
    public static int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        // List<Integer> list = new ArrayList<>();

        // helper(root,list);
        // return list.get(k-1);
        count = k;
        helper(root);
        return number;
    }
    // public static void helper(TreeNode root, List<Integer> list)
    // {
    //     if( root == null )
    //     {
    //         return;
    //     }
    //     helper(root.left,list);
    //     list.add(root.val);
    //     helper(root.right,list);
    // }
    public static void helper(TreeNode root)
    {  
        if( root.left != null )
        {
            helper(root.left);
        }
        count--;
        if( count == 0)
        {
            number = root.val;
            return;
        }
        if( root.right != null)
        {
            helper(root.right);
        }
    }
}
