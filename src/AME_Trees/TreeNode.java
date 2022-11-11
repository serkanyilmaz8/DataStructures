package AME_Trees;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){

    }

    public TreeNode(int val){
        this.value = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.value = val;
        this.left = left;
        this.right = right;
    }
}
