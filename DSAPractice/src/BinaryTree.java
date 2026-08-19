import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    // ---------------- Inorder ----------------
    static void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // ---------------- Preorder ----------------
    static void preorder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // ---------------- Postorder ----------------
    static void postorder(TreeNode root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // ---------------- Level Order (BFS) ----------------
    static void levelOrder(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);//1 2 3 4 5 6 7

//        while (!queue.isEmpty()) {
//
//            TreeNode current = queue.poll();
//
//            System.out.print(current.val + " ");
//
//            if (current.left != null)
//                queue.offer(current.left);
//
//            if (current.right != null)
//                queue.offer(current.right);
//        }


//        1
//        2 3
//        4 5 6 7
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                System.out.print(current.val + " ");

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }

            System.out.println(); // Move to the next level
        }
    }
//    class Solution {
//        public List<List<Integer>> levelOrder(TreeNode root) {
//
//            List<List<Integer>> ans = new ArrayList<>();
//
//            if (root == null)
//                return ans;
//
//            Queue<TreeNode> queue = new LinkedList<>();
//            queue.offer(root);
//
//            while (!queue.isEmpty()) {
//
//                int size = queue.size();
//                List<Integer> level = new ArrayList<>();
//
//                for (int i = 0; i < size; i++) {
//
//                    TreeNode current = queue.poll();
//
//                    level.add(current.val);
//
//                    if (current.left != null)
//                        queue.offer(current.left);
//
//                    if (current.right != null)
//                        queue.offer(current.right);
//                }
//
//                ans.add(level);
//            }
//
//            return ans;
//        }
//    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.print("Inorder : ");
        inorder(root);

        System.out.println();

        System.out.print("Preorder : ");
        preorder(root);

        System.out.println();

        System.out.print("Postorder : ");
        postorder(root);

        System.out.println();

        System.out.print("Level Order : "+"\n");
        levelOrder(root);

    }
}
