class LinkedList{
    protected Node head;
    protected Node tail;
    private int size=0;
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int val;
        Node next;

        public Node(){
            this.val=0;
            this.next=null;
        }
        public Node(int x){
            this.val = x;
            this.next = null;
        }
        public Node(int x,Node next){
            this.val = x;
            this.next = next;
        }
    }
    public void insertAtFirst(int x){
        head = new Node(x, head);
        size++;
        if(tail == null){
            tail = head;
        }
        System.out.println(tail.val);
    }
    public void insertAtEnd(int x){
        if(tail == null){
            insertAtFirst(x);
        }
        else{
            Node temp = new Node(x);
            tail.next = temp;
            tail = temp;
            size++;
        }

    }
    public void display(){
        if(head == null){
            System.out.println("LL is empty!!");
        }
        else{
            Node t = head;
            while(t!=null){
                System.out.print(t.val+" -> ");
                t = t.next;
            }
        }
        System.out.println("null");
    }
}

// Trying to execute the code... Worked Just fine.
//public class LL {
//    public static void main(String[] args) {
//        LinkedList a = new LinkedList();
//        a.insertAtFirst(4);
//        a.insertAtFirst(3);
//        a.insertAtFirst(2);
//        a.insertAtFirst(1);
//        a.insertAtEnd(5);
//        a.display();
//
//    }
//
//}
