public class buildBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root= new Node(val);
            return root;
            //return new Node(val);
        }
        if(root.data > val){
            root.left=insert(root.left, val);
        }else if(root.data < val){
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();
    }
}
