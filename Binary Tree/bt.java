
import java.util.Scanner;

public class bt {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeB {
        static int index = -1;

        public Node buildTree(String[] nodes) {
            index++;
            if (nodes[index].equals("N")) {
                return null;
            }
            Node newNode = new Node(Integer.parseInt(nodes[index]));
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preorderTrav(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderTrav(root.left);
            preorderTrav(root.right);
        }

        public void inorderTrav(Node root) {
            if (root == null) {
                return;
            }
            inorderTrav(root.left);
            System.out.print(root.data + " ");
            inorderTrav(root.right);
        }

        public void postorderTrav(Node root) {
            if (root == null) {
                return;
            }
            postorderTrav(root.left);
            postorderTrav(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements separated by spaces: ");
        String input = scanner.nextLine();
        String[] nodes = input.split(" ");

        BinaryTreeB tree = new BinaryTreeB();
        Node root = tree.buildTree(nodes);
        System.out.println("root of tree: " + root.data + " ");
        System.out.print("Preorder traversal: ");
        tree.preorderTrav(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        tree.inorderTrav(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        tree.postorderTrav(root);
    }
}
