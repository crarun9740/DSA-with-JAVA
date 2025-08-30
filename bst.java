class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;
    }
}
public class bst {

    public TreeNode insert(TreeNode root,int key){
        if(root==null) return new TreeNode(key);

        if(key < root.data){
            root.left=insert(root.left, key);
        }
        else if (key > root.data) {
            root.right=insert(root.right, key);
        }
        return root;
    }

    public void inorder(TreeNode root){
        if(root==null) return ;
      inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);

    }

    public static void main(String[] args) {
        bst b=new bst();

        TreeNode root=null;
       root= b.insert(root, 50);
       b.insert(root, 20);
       b.insert(root, 60);
       b.insert(root, 40);
       b.insert(root, 70);
       b.insert(root, 90);
       b.insert(root, 80);

       System.out.println("Inorder Traversal of bst");
       b.inorder(root);
      
        
    }
}