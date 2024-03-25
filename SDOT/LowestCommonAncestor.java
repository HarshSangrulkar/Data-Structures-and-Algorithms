import java.util.Scanner;

public class LowestCommonAncestor {
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

    public Node buildTree(String[] nodes, int index) {
        if (index >= nodes.length || nodes[index].equals("N")) {
            return null;
        }
        Node newNode = new Node(Integer.parseInt(nodes[index]));
        newNode.left = buildTree(nodes, 2 * index + 1);
        newNode.right = buildTree(nodes, 2 * index + 2);
        return newNode;
    }

    public Node lca(Node root, Node p, Node q) {
        if (root == null || root.data == p.data || root.data == q.data) {
            return root;
        }
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int pData = sc.nextInt();
        int qData = sc.nextInt();
        Node p = new Node(pData);
        Node q = new Node(qData);

        String nodes[] = input.split(" ");
        LowestCommonAncestor tree = new LowestCommonAncestor();
        Node root = tree.buildTree(nodes, 0);

        Node lcaNode = tree.lca(root, p, q);
        System.out.println(lcaNode.data);
    }
}
