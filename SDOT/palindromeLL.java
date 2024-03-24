import java.util.*;
public class palindromeLL {
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

    public Node midNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(Node head){
        //0. base case
        if(head==null || head.next==null){
            return true;
        }
        //1. find mid
        Node midNode = midNode(head);
        //2. reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //3. compare
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public void creatLL(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindromeLL LL1 = new palindromeLL();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            LL1.creatLL(data);
        }
        boolean isPalindrome = LL1.isPalindrome(LL1.head);
        if(isPalindrome)
            System.out.println("The linked list is a palindrome.");
        else
            System.out.println("The linked list is not a palindrome.");
    }
}
