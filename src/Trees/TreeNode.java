package Trees;

// Node structure
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

//public class BST {
//
//    TreeNode root;
//
//    // Insert a value in BST
//    public void insert(int val) {
//        root = insertRec(root, val);
//    }
//
//    private TreeNode insertRec(TreeNode node, int val) {
//        if (node == null) {
//            return new TreeNode(val);
//        }
//
//        if (val < node.val) {
//            node.left = insertRec(node.left, val);
//        } else if (val > node.val) {
//            node.right = insertRec(node.right, val);
//        }
//        // duplicates ignored
//        return node;
//    }
//
//    // Search a value in BST
//    public boolean search(int val) {
//        return searchRec(root, val);
//    }
//
//    private boolean searchRec(TreeNode node, int val) {
//        if (node == null) return false;
//
//        if (val == node.val) return true;
//        else if (val < node.val) return searchRec(node.left, val);
//        else return searchRec(node.right, val);
//    }
//
//    // Delete a value from BST
//    public void delete(int val) {
//        root = deleteRec(root, val);
//    }
//
//    private TreeNode deleteRec(TreeNode node, int val) {
//        if (node == null) return null;
//
//        if (val < node.val) {
//            node.left = deleteRec(node.left, val);
//        } else if (val > node.val) {
//            node.right = deleteRec(node.right, val);
//        } else {
//            // Node found
//            if (node.left == null) return node.right;
//            if (node.right == null) return node.left;
//
//            // Node has two children -> replace with inorder successor
//            TreeNode successor = minValue(node.right);
//            node.val = successor.val;
//            node.right = deleteRec(node.right, successor.val);
//        }
//        return node;
//    }
//
//    private TreeNode minValue(TreeNode node) {
//        while (node.left != null) node = node.left;
//        return node;
//    }
//
//    // Traversals
//    public void inorder() {
//        inorderRec(root);
//        System.out.println();
//    }
//
//    private void inorderRec(TreeNode node) {
//        if (node == null) return;
//        inorderRec(node.left);
//        System.out.print(node.val + " ");
//        inorderRec(node.right);
//    }
//
//    public void preorder() {
//        preorderRec(root);
//        System.out.println();
//    }
//
//    private void preorderRec(TreeNode node) {
//        if (node == null) return;
//        System.out.print(node.val + " ");
//        preorderRec(node.left);
//        preorderRec(node.right);
//    }
//
//    public void postorder() {
//        postorderRec(root);
//        System.out.println();
//    }
//
//    private void postorderRec(TreeNode node) {
//        if (node == null) return;
//        postorderRec(node.left);
//        postorderRec(node.right);
//        System.out.print(node.val + " ");
//    }
//}

