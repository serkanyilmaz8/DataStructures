package AME_Trees;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    static List<Integer> result = new ArrayList<Integer>();

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);

        left.left = new TreeNode(4);
        left.right = new TreeNode(5);

        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        result = preOrderTraversal(root);
        System.out.println(result);


    }

    public static List<Integer> preOrderTraversal(TreeNode root){
        if (root != null) {
            result.add(root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }
        return result;
    }
}
