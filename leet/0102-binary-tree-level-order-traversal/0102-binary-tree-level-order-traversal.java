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
        List<List<Integer>> result=new ArrayList<>();

        if(root==null)
			return result;
		else
		{
			Queue<TreeNode> que=new LinkedList<>();
			
			que.offer(root);
			
			while(!que.isEmpty())
			{
                int size=que.size();            //Size=At this time Queue has all refereneces of that level alone
                List<Integer> res=new ArrayList<>();
                for(int i=0; i<size; i++)       //For Controlling the deque/printing;
                {
				    TreeNode temp=que.poll();
                    res.add(temp.val);
			
				    if(temp.left!=null)
					    que.offer(temp.left);
				    if(temp.right!=null)
					    que.offer(temp.right);
                }
                result.add(res);
			}
		}
        return result;
    }
}