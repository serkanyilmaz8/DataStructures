package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.insertRecursively(10);
        bst1.insertRecursively(15);
        bst1.insertRecursively(5);
        bst1.insertRecursively(11);
        bst1.insertRecursively(6);
        bst1.insertRecursively(3);
        bst1.insertRecursively(16);


        bst1.inorderTraversal();
        System.out.println("search 18: " + bst1.search(18));
        System.out.println("search 10: " + bst1.searchRecursively(10));

        System.out.println("parent of 4(no exist): " + bst1.findParent(4));
        System.out.println("parent of 10(root): " + bst1.findParent(10));
        System.out.println("parent of 11(exist): " + bst1.findParent(11));

        int height = bst1.findHeight();
        System.out.println("Height of the tree: " + height);

        bst1.deleteRecursively(10);
        System.out.println("10 deleted");
        bst1.inorderTraversal();

    }
}
