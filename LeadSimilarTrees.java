public class LeadSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        // calling addLeaves for tree1
        addLeaves(root1,list1);
        // calling addLeaves for tree1
        addLeaves(root2,list2);
        // if both lists are not in same size then returning false
        if( list1.size() != list2.size())
        {
            return false;
        }

        // traversing through each index, if any element is not same at any index returning false.
        for( int i = 0; i < list1.size(); i++)
        {
            if( list1.get(i) != list2.get(i))
            {
                return false;
            }
        }
        return true;

    }
    // Method to fill all leaf nodes
    public void addLeaves(TreeNode root, List<Integer> list)
    {
        // if its null just returning it
        if(root == null)
        {
            return ;
        }
        // if its lead node, if current nodes left and right are null then adding it to list
        if( root.left == null && root.right == null)
        {
            list.add(root.val);
        }
        // repeating same process by passing left tree and right tree
        addLeaves(root.left,list);
        addLeaves(root.right,list);
        return;
    }
}
