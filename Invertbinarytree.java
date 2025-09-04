class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;
    }
}

class invertbinarytree{
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    TreeNode insert(TreeNode root,int key){
        if(root==null) return new TreeNode(key);
        if(key < root.data){
            root.left=insert(root.left, key);
        }
        else if(key > root.data){
            root.right=insert(root.right, key);
        }
        return root;
    }
    boolean Search(TreeNode root,int key){
        if(root==null) return false;

        if(root.data==key) return true;

        else if(key < root.data){
            return Search(root.left, key);
        }
        else if(key > root.data){
            return Search(root.right, key);
        }
        return false;

    }
    public TreeNode invert(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invert(root.left);
        invert(root.right);

        return root;
    }
   public static void main(String[] args) {

    invertbinarytree b=new invertbinarytree();
    TreeNode root=null;
    root=b.insert(root, 20);
    b.insert(root,15);
    b.insert(root,25);
    b.insert(root,35);
    b.insert(root,11);

    System.out.println("Inorder of the BST is  : ");
    b.inorder(root);
    System.out.println();

    System.out.println("Node is present? : "+b.Search(root, 25));
    System.out.println("Node is present? : "+b.Search(root, 0));

    b.invert(root);
    System.out.println("After the invert");
    b.inorder(root);
   }
}