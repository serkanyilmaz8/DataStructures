package AME_Trees;

import java.util.ArrayList;
import java.util.List;

public class Recursive_Traversal {
    static List<Integer> result = new ArrayList<>();
    static List<Integer> result2 = new ArrayList<>();
    static List<Integer> result3 = new ArrayList<>();


    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);

        left.left = new TreeNode(4);
        left.right = new TreeNode(5);

        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        result = preOrderTraversal(root);
        result2 = inOrderTraversal(root);
        result3 =  postOrderTraversal(root);

        System.out.print("preorder traversal: ");
        System.out.println(result);
        System.out.println();

        System.out.print("inorder traversal: ");
        System.out.println(result2);
        System.out.println();

        System.out.print("postorder traversal: ");
        System.out.println(result3);


    }

    public static List<Integer> preOrderTraversal(TreeNode root){
        if (root != null) {
            result.add(root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }
        return result;
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        if(root != null){
            inOrderTraversal(root.left);
            result2.add(root.value);
            inOrderTraversal(root.right);
        }
        return result2;
    }

    public static List<Integer> postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            result3.add(root.value);
        }
        return result3;
    }
}
