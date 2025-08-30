class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.left=this.right=null;
        this.data=data;
    }
}

public class bstInsert {
    public TreeNode Insert(TreeNode root,int key){
        if(root==null) return new TreeNode(key);
        if(key < root.data){
            root.left=Insert(root.left, key);
        }
        else if(key > root.data){
            root.right=Insert(root.right, key);
        }
        return root;
    }
    public void Inorder(TreeNode root){
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        bstInsert b=new bstInsert();
        TreeNode root=null;

        root=b.Insert(root, 100);
        b.Insert(root, 70);
        b.Insert(root, 80);
        b.Insert(root, 10);
        b.Insert(root, 20);
        b.Insert(root, 50);
        b.Insert(root, 250);
        b.Insert(root, 150);
        b.Insert(root, 250);

        System.out.println("Inorder of BST insert is : ");
        b.Inorder(root);
    }
}
