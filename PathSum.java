

// Time Complexity : O(N)
// Space Complexity : O(H or log N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class PathSum {
	public int sumNumbers(TreeNode root){
		return sum(root,0);
	}
	
	public int sum(TreeNode root,int val){
		if(root == null) 
			return 0;
		if(root.left == null && root.right == null){
			return val * 10 + root.val;
		}
		return sum(root.left,val * 10 + root.val) + sum(root.right,val * 10 + root.val);
	}
}