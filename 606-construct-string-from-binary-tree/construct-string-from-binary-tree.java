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
public class Solution {
    public String tree2str(TreeNode root) {
        // Step 1: Base case - if the root is null, return an empty string
        if (root == null) return "";
        
        // Step 2: Start with the value of the current node as the result string
        String result = root.val + "";
        
        // Step 3: Recursively process the left and right subtrees
        String leftSubtree = tree2str(root.left);
        String rightSubtree = tree2str(root.right);
        
        // Step 4: Check conditions to determine the final result
        if (leftSubtree.equals("") && rightSubtree.equals("")) {
            // Both left and right subtrees are empty, return the current result
            return result;
        }
        if (leftSubtree.equals("")) {
            // Left subtree is empty, include empty parentheses for it
            return result + "()" + "(" + rightSubtree + ")";
        }
        if (rightSubtree.equals("")) {
            // Right subtree is empty, include the left subtree
            return result + "(" + leftSubtree + ")";
        }
        
        // Both left and right subtrees are non-empty, include both in the result
        return result + "(" + leftSubtree + ")" + "(" + rightSubtree + ")";
    }
}