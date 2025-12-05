package Trees;

public class BinaryTreeInorderTraversal {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }
    void inorder(TreeNode root){
        if(root==null)return;

        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
