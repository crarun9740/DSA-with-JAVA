class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;
    }
}
public class SearchBST {
    public TreeNode insert(TreeNode root,int key){
        if(root==null) return new TreeNode(key);

        if(key < root.data){
            root.left=insert(root.left, key);
        }
        else if(key > root.data){
            root.right=insert(root.right, key);
        }
        return root;
    }
    public boolean Search(int key,TreeNode root){
        if(root == null) return false;

        if(root.data==key) return true;

        else if(key < root.data){
            return Search(key, root.left);
        }
        else if(key > root.data){
            return Search(key, root.right);
        }
        return false;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        SearchBST s=new SearchBST();
        TreeNode root=null;

        root=s.insert(root, 50);
        s.insert(root, 60);
        s.insert(root, 10);
        s.insert(root, 20);
        s.insert(root, 70);
        s.insert(root, 70);
        
        System.out.println("Inorder of Bst is");
        s.inorder(root);
        System.out.println();
        System.out.println(s.Search(50, root));
        System.out.println(s.Search(90, root));
    }
}
