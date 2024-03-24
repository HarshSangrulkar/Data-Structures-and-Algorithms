import java.util.Scanner;

public class ReorderLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null; 
        }
    }
    public Node head;
    public Node tail;
    public void creatLL(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public Node midNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node reorderLL(Node head){
        //0. bases case
        if(head==null && head.next==null){
            return null;
        }
        //1. find mid
        Node midNode = midNode(head);
        //2. reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //3. alternate matching
        Node left = head;
        Node right = prev;
        Node nextL;
        Node nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            right = nextR;
            left=nextL;
        }
        return head;
    }
    public void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReorderLL LL1 = new ReorderLL();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            LL1.creatLL(data);
        }
        LL1.reorderLL(LL1.head);
        LL1.printLL(LL1.head);
    }
}
