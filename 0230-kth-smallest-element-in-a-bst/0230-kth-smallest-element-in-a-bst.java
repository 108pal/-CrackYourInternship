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
    public void inorder(TreeNode root, int []counter,int k ,int []ksmallest){
        if(root==null || counter[0]>=k) return ;
        inorder(root.left,counter,k,ksmallest);
        counter[0]++;
        if(counter[0]==k){
            ksmallest[0]=root.val;
            return;
        }
        inorder(root.right,counter,k,ksmallest);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] ksmallest = new int[]{Integer.MIN_VALUE};
        int[] counter = new int[]{0};

        inorder(root,counter,k,ksmallest);
        return ksmallest[0];
    }
}