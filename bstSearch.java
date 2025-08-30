class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;
    }
}
public class bstSearch {
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public TreeNode Insert(TreeNode root,int key){
        if(root == null) return new TreeNode(key);

        if(key < root.data){
            root.left=Insert(root.left, key);
        }
        else if(key > root.data){
            root.right=Insert(root.right, key);
        }
        return root;
    }
    public boolean Search(TreeNode root,int key){
        if(root == null) return false;

        if(root.data==key){
            return true;
        }
        else if(root.data < key){
            return Search(root.right, key);
        }
        else if(root.data > key){
            return Search(root.left, key);
        }
        return false;
    }
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        int leftheighth=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheighth, rightheight)+1;
    }
    public static void main(String[] args) {
        bstSearch b=new bstSearch();

        TreeNode root=null;
        root=b.Insert(root, 6);
        b.Insert(root, 2);
        b.Insert(root, 5);
        b.Insert(root, 8);
        b.Insert(root, 3);
        b.Insert(root, 11);
        b.Insert(root, 21);

        System.out.println("INORDER :  ");
        b.inorder(root);
        System.out.println();

        System.out.println(b.Search(root, 9));
        System.out.println(b.height(root));
    }
}
