package Competitive-Coding-10;

public class problem1 {
    //TC:- O(n)
    //SC:- O(n) 
    int ans = 0; 
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;

         helper(root, root.val);
        return ans;
    }
    public int helper(TreeNode root, int max){
        //base
        if(root == null) return 0;
        
        //logic
        if(root.val >= max){
            max = root.val;
            ans = ans + 1;
        }
        helper(root.left, max);
        helper(root.right, max);
        
        return 0;
    }
}
