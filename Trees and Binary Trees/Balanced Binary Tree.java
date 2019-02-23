// Given a binary tree, determine if it is 
// height-balanced
// .

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: true
// Example 2:


// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
// Example 3:

// Input: root = []
// Output: true
 

// Constraints:

// The number of nodes in the tree is in the range [0, 5000].
// -104 <= Node.val <= 104
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
public int rightValue(TreeNode root) 
    {
       if(root==null)
       {
           return 0;
       }
        return 1+rightValue(root.right);
    }
    public int leftValue(TreeNode root) 
    {
       if(root==null)
       {
           return 0;
       }
        return 1+leftValue(root.left);
    }
    public boolean isBalanced(TreeNode root) {
       int leftVal = leftValue(root) ;
       int rightVal = rightValue(root);
       System.out.println("left"+(leftVal));
       System.out.println("right"+(rightVal));
       System.out.println("hieght"+(leftVal-rightVal));
    if(Math.abs(leftVal)-Math.abs(rightVal)>1)
    {
        return false;
    }
    return true;

    }
}
