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
    public boolean checkTree(TreeNode root) {
        if(root.left.val + root.right.val == root.val){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode sol = new TreeNode(1);
        TreeNode sag = new TreeNode(3);
        TreeNode kok = new TreeNode(4,sol, sag);
        TwoSum cozum = new TwoSum();
        System.out.println(cozum.checkTree(kok));

    }
}