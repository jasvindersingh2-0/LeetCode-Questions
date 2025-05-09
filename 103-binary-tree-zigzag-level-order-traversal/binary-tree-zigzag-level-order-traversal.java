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
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>>ans=new ArrayList();
        if(root==null)return ans;
        Deque<TreeNode>q=new LinkedList();
        q.addLast(root);
        int level=0;
        while(!q.isEmpty()){
            int siz=q.size();
            LinkedList<Integer>arr=new LinkedList();
            for(int i=0;i<siz;i++){
                
                 TreeNode a=q.removeFirst();
                if(level%2==0)arr.addLast(a.val);
                else{arr.addFirst(a.val);}
                if(a.left!=null)q.addLast(a.left);
                if(a.right!=null)q.addLast(a.right);
            }
            level++;
            ans.add(arr);
        }
        return ans;
	}
     
}