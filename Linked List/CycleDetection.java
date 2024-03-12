public class CycleDetection {
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

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;// loop detected
            }
        }    
        return false;// loop doesnt exist
            
            
        
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(isCycle());

    }
}
