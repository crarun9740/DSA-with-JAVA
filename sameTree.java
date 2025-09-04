

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;
    }
}
public class sameTree {
    public boolean  IsSame(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.data!=q.data){
            return false;
        }

        return IsSame(p.left, q.left) &&IsSame(p.right, q.right);
    }
    public static void main(String[] args) {
        sameTree s=new sameTree();
        TreeNode a1=new TreeNode(1);
        a1.left=new TreeNode(2);
        a1.right=new TreeNode(3);

        TreeNode a2=new TreeNode(1);
        a2.left=new TreeNode(2);
        a2.right=new TreeNode(3);

        TreeNode a3=new TreeNode(1);
        a3.left=new TreeNode(3);
        a3.right=new TreeNode(2);

        System.out.println(s.IsSame(a1,a2));
        System.out.println(s.IsSame(a1,a3));
    }
}
