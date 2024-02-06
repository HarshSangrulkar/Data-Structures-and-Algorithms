
public class CreateLinkedListt {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;

        public static void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head=newNode;
        }

        public static void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail=newNode;
        }

        public static void printLL(){
            Node temp = head;
            if(head == null){
                System.out.println("linked list is empty");
            }
            while(temp != null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            CreateLinkedListt ll = new CreateLinkedListt();
            ll.printLL();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.printLL();
            ll.addLast(3);
            ll.addLast(4);
            ll.printLL();
        }
        
}
