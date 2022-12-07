package BinaryTree;

public class BinarySearchTree <T extends Comparable>{
    TNode root;

    public void insert(T val){
        if(root == null){
            root = new TNode<>(val);
        }else{
            TNode iterator = root;
            TNode newNode = new TNode<>(val);
            while (iterator != null){
                if(val.compareTo(iterator.value) == -1){
                    if(iterator.left == null) {
                        iterator.left = newNode;
                        break;
                    }
                    iterator = iterator.left;
                }else{
                    if(iterator.right == null){
                        iterator.right = newNode;
                        break;
                    }
                    iterator = iterator.right;
                }
            }
        }
    }

    public void insertRecursively(T val){
        this.root = insertRecursively(root, val);
    }
    public TNode insertRecursively(TNode cRoot, T val){
        if(cRoot == null)
            return new TNode<>(val);
        else if(val.compareTo(cRoot.value) == -1)
            cRoot.left = insertRecursively(cRoot.left, val);
        else
            cRoot.right = insertRecursively(cRoot.right, val);
        return cRoot;
    }

    public void inorderTraversal(){
        System.out.print("inorder Traversal: ");
        inorderTraversal(this.root);
        System.out.println();
    }
    private void inorderTraversal(TNode cRoot){
        if(root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        if(cRoot != null){
            inorderTraversal(cRoot.left);
            System.out.print(cRoot.value + "  ");
            inorderTraversal(cRoot.right);
        }
    }

    public boolean search(T val){
        TNode iterator = root;
        while(iterator != null){
            if(val.compareTo(iterator.value) == 0)
                return true;
            else if(val.compareTo(iterator.value) == -1)
                iterator = iterator.left;
            else
                iterator = iterator.right;
        }
        return false;
    }

    public boolean searchRecursively(T val){
        return searchRecursively(root, val);
    }

    private boolean searchRecursively(TNode cRoot, T val){
        if(cRoot == null)
            return false;
        else if(cRoot.value.compareTo(val) == 0)
            return true;
        else if(cRoot.value.compareTo(val) == 1)
            return searchRecursively(cRoot.left, val);
        else
            return searchRecursively(cRoot.right, val);
    }

    public T findParent(T val){
        if(root == null){
            System.out.println("Tree is Empty");
            return null;
        }else if(val.compareTo(root.value) == 0){
            System.out.println("This node is the root and it doesn't have parent");
            return null;
        }else {
            TNode iterator = root;
            TNode parent = root;

            while(iterator != null){
                if(val.compareTo(iterator.value) == 0)
                    return (T)parent.value;
                if(val.compareTo(iterator.value) == 1){
                    parent = iterator;
                    iterator = iterator.right;
                }else{
                    parent = iterator;
                    iterator = iterator.left;
                }
            }
            System.out.println("Parent could not found");
            return null;
        }
    }

    public int findHeight(){
        return findHeight(root);
    }

    private int findHeight(TNode currentRoot){
        if(root == null){
            System.out.println("Tree is Empty");
            return 0;
        }else{
            int leftHeight = 0;
            int rightHeight = 0;

            if(currentRoot.left != null)
                leftHeight = findHeight(currentRoot.left);

            if(currentRoot.left != null)
                rightHeight = findHeight(currentRoot.right);

            int max = (leftHeight > rightHeight) ? leftHeight:rightHeight;

            return(max+1);
        }
    }
/*
    public void deleteRecursively(T val){
        deleteRecursively(root, val);
    }

    private TNode deleteRecursively(TNode cRoot, T val){

    }*/

}
