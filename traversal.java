class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;
    }
}
public class traversal {
    void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
       
    }
    void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
       traversal t=new traversal();
       TreeNode root=new TreeNode(1);
       root.left=new TreeNode(2);
       root.right=new TreeNode(3);
       root.left.left=new TreeNode(4);
       root.left.right=new TreeNode(5);
       root.right.left=new TreeNode(6);
       root.right.right=new TreeNode(7);

       System.out.println("Preorder : " );
       t.preorder(root);
       System.out.println();

       System.out.println("Inorder : ");
       t.inorder(root);
       System.out.println();

       System.out.println("Postorder");
       t.postorder(root);
       System.out.println();
    }
}
