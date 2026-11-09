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

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        //swap method
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        dfs(root.left);
        dfs(root.right);

    }

    public TreeNode invertTree(TreeNode root) {
        //recursive algo
        // Invert each node's children: 
        //Node temp = root.left
        //root.left = root.right
        //root.right = root.left

        if (root == null) {
            return root;
        }

        dfs(root);
        return root;
    }
}
