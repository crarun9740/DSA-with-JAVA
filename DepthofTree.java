class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;
    }
}

public class DepthofTree {
    void INORDER(TreeNode root){
        if(root== null) return;

        INORDER(root.left);
        System.out.print(root.data+" ");
        INORDER(root.right);
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
    public static int depth(TreeNode root){
        if(root==null) return 0;

        int leftdepth=depth(root.left);
        int rightdepth=depth(root.right);
        return Math.max(leftdepth, rightdepth)+1;
    }
    public static int height(TreeNode root){
        if(root==null) return 0;

        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight, rightheight)+1;
    }
    public static void main(String[] args) {
       DepthofTree d=new DepthofTree();
       TreeNode root=null;

       root=d.insert(root,3);
       d.insert(root, 6);
       d.insert(root, 4);
       d.insert(root, 1);
       d.insert(root, 7);
       d.insert(root, 8);

       System.out.println("Inorder of BST : ");
       d.INORDER(root);
       System.out.println();

       System.out.println(depth(root));
    }
}
