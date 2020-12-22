// Time Complexity:O(n)
//Space complexity:O(h)

class Solution {
    public TreeNode invertTree(TreeNode root) {
        //edge
        if(root==null) return null;
        
        helper(root);
        return root;
    }
    public void helper(TreeNode root)
    {
        //base
        if(root==null) return;
        //logic
        helper(root.left);
        helper(root.right);
        //action
         TreeNode temp=root.left;
         root.left=root.right;
         root.right=temp;
    }
}
