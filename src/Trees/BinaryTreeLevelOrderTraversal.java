package Trees;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                temp.add(curr.val);

                if (curr.left != null)  q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            res.add(temp);
        }
        return res;
    }
}
