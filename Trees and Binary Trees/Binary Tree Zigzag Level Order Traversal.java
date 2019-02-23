// Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[20,9],[15,7]]
// Example 2:

// Input: root = [1]
// Output: [[1]]
// Example 3:

// Input: root = []
// Output: []
 

// Constraints:

// The number of nodes in the tree is in the range [0, 2000].
// -100 <= Node.val <= 100
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
       List<List<Integer>> answer = new ArrayList<>();
       if(root==null)
       {
           return answer;
       } 
       Queue<TreeNode> que = new LinkedList<>();

       que.offer(root);
      boolean flag = true;

       while(!que.isEmpty())
       {
           int size = que.size();
           List<Integer> list = new ArrayList<>(size);
            for(int i=0;i<size;i++)
            {
                TreeNode node = que.peek();
                 if(node.left!=null)
                 {
                     que.offer(node.left);
                 }
                 if(node.right!=null)
                 {
                     que.offer(node.right);
                 }
                 if(flag==true)
                 {
                     list.add(que.poll().val);
                 }
                 else
                 {
                     list.add(0,que.poll().val);
                 }
            }
            flag = !flag;
            answer.add(list);
       }
       return answer;
    }
}
