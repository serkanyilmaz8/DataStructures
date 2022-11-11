package AME_Trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);

        left.left = new TreeNode(4);
        left.right = new TreeNode(5);

        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        result = postOrderTraversal(root);
        System.out.println(result);
    }

    public static List<Integer> postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            result.add(root.value);
        }
        return result;
    }
}
