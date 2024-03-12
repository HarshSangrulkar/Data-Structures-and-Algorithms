public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTreeB{
        static int index=-1;
        public Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
        public void preorderTrav(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderTrav(root.left);
            preorderTrav(root.right);
        }
        public void inorderTrav(Node root){
            if(root==null){
                return;
            }
            inorderTrav(root.left);
            System.out.print(root.data+" ");
            inorderTrav(root.right);
        }
        public void postorderTrav(Node root){
            if(root==null){
                return;
            }
            postorderTrav(root.left);
            postorderTrav(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeB tree= new BinaryTreeB();
        Node root =  tree.buildTree(nodes);
        System.out.println("root of tree: "+root.data+" ");
        tree.preorderTrav(root);
        System.out.println();
        tree.inorderTrav(root);
        System.out.println();
        tree.postorderTrav(root);
    }
}