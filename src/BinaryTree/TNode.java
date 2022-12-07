package BinaryTree;

public class TNode <T extends Comparable> {
    T value;
    TNode left;
    TNode right;

    public TNode(T value) {
        this.value = value;
    }
}
