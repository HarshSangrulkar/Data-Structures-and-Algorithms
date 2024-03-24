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

    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node prev=null;
        Node curr=head;
        Node next;

        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
}
