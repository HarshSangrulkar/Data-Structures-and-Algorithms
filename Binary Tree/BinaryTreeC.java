//import java.util.*;
public class BinaryTreeC {
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
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    static class BinaryTree{
        static int index=-1;
        //1. create binary tree
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
        //2. preorder traversal
        public void preorderTraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        //3. inorder traversal
        public void inorderTraversal(Node root){
            if(root==null){
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }
        //4. postorder traversal
        public void postorderTraversal(Node root){
            if(root==null){
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data+" ");
        }
        //5. height of tree
        public int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            return Math.max(leftHeight, rightHeight)+1;
        }
        //6. sum of nodes
        public int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=sumOfNodes(root.left);
            int rightSum=sumOfNodes(root.right);
            int selfSum=leftSum+rightSum+root.data ;
            return selfSum;
        }
        //7. diameter of tree 
        public int diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftDiam=diameter(root.left);
            int leftHeight = height(root.left);

            int rightDiam=diameter(root.right);
            int rightHeight=height(root.right);

            return Math.max(leftHeight+rightHeight+1,Math.max(leftDiam,rightDiam));
        }
        public Info diameter2(Node root){
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);
            int diam = Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.diam, rightInfo.diam));
            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
            return new Info(diam, ht);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print("root node: "+root.data);
        System.out.println();
        System.out.print("preorder traversal: "); 
        tree.preorderTraversal(root);
        System.out.println();
        System.out.print("inorder traversal: ");
        tree.inorderTraversal(root);
        System.out.println();
        System.out.print("postorder traversal: ");
        tree.postorderTraversal(root);
        System.out.println();
        System.out.println("height of tree: "+tree.height(root));
        System.out.println("sum of nodes: "+tree.sumOfNodes(root));
        System.out.println("diameter of tree: "+tree.diameter(root));

        Info diameterInfo = tree.diameter2(root);
        System.out.println("diameter of tree is: "+diameterInfo.diam);


    }
}
