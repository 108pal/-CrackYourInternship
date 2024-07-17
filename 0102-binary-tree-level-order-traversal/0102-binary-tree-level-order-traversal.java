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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Mainlist=new ArrayList<List<Integer>>();
        Queue <TreeNode> q= new LinkedList<>();
        if(root==null){
           return Mainlist;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int levelnum=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<levelnum;i++){
                if(q.peek().left!= null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!= null){
                    q.offer(q.peek().right);
                }
                list.add(q.poll().val);
            }
            Mainlist.add(list);
        }
        return Mainlist;
    }
}