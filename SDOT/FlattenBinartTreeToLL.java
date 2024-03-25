import java.util.Scanner;

public class FlattenBinartTreeToLL {
    static class Node {
        int data;
        Node next;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.left = null;
            this.right = null;
        }
    }

    public Node head;
    public Node tail;
    static int index = -1;
    // public Node buildTree(String[] nodes) {
    // index++;
    // if (index >= nodes.length || nodes[index].equals("N")) {
    // return null;
    // }
    // Node newNode = new Node(Integer.parseInt(nodes[index]));
    // newNode.left = buildTree(nodes);
    // newNode.right = buildTree(nodes);

    // return newNode;
    // }
    public Node buildTree(String[] nodes, int index) {
        if (index >= nodes.length || nodes[index].equals("N")) {
            return null;
        }
        Node newNode = new Node(Integer.parseInt(nodes[index]));
        newNode.left = buildTree(nodes, 2 * index + 1);
        newNode.right = buildTree(nodes, 2 * index + 2);
        return newNode;
    }

    public void flatten(Node root) {
        if (root == null) {
            return;
        }
        Node left = root.left;
        Node right = root.right;

        flatten(root.left);
        flatten(root.right);

        root.left = null;
        root.right = left;

        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        curr.right = right;
    }

    public void printLL(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.right;
        }
        System.out.println();
    }

    public void inorderTrav(Node root) {
        if (root == null) {
            return;
        }
        inorderTrav(root.left);
        System.out.print(root.data + " ");
        inorderTrav(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements separated by spaces: ");
        String input = scanner.nextLine();
        String[] nodes = input.split(" ");

        FlattenBinartTreeToLL tree = new FlattenBinartTreeToLL();
        Node root = tree.buildTree(nodes, 0);
        tree.flatten(root);
        System.out.println("Linked list after flattening the binary tree:");
        tree.printLL(root);
        tree.inorderTrav(root);
    }
}
