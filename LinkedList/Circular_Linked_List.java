class circular{
    private Node head;
    private Node tail;
    private int size=0;
    public circular(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int val;
        Node next;
        public Node(){
            this.val =0;
            this.next = null;
        }
        public Node(int x){
            this.val=x ;
            this.next = null;
        }
        public Node(int x, Node next){
            this.val=x ;
            this.next = next;
        }
    }
    public void insertFirst(int x ){
        if(head == null){
            Node a = new Node(x,null);
            head = a;
            tail = a;
        }
        else{
            head = new Node(x,head);
            tail.next = head;
        }
        size++;
    }
    public void insertAtEnd(int x){
        if(head == null){
            insertFirst(x);
        }
        else{
            tail.next = new Node(x,head);
            tail = tail.next;
        }
        size++;
    }
    public void insertAfter(int x,int y){
        if(head == null){
            System.out.println("LL is empty!! ");
            return;
        }
        else if(tail.val == x){
            insertAtEnd(y);
            return;
        }
        else if (find(x) == false){
            System.out.println("No node found with given value: "+x);
        }
        else{
            Node t = head;
            do{
                if(t.val == x){
                    break;
                }
                t = t.next;
            }while(t!=head);
                Node a = new Node(y, t.next);
                t.next = a;
                size++;
            }
    }
    public void insertBefore(int x,int y){
        if(head == null){
            System.out.println("LL is empty!! ");
            return;
        }
        else if(find(x) == false){
            System.out.println("No node found with given value: "+ x );
            return;
        }
        else{
            Node t = head;
            if(head.val == x){
                insertFirst(y);
            }
            else{
                Node a = new Node(y);
                do {
                    if (t.next.val == x) {
                        break;
                    }
                    t = t.next;
                } while (t.next.next != head);

                    a.next = t.next;
                    t.next = a;
                    size++;
            }
        }

    }
    public boolean find(int x){
        if(head == null){
            System.out.println("LL is empty!!");
            return false;
        }
        else{
            Node t = head;
            do{
                if(t.val == x){
//                    System.out.println(t.val);
                    return true;
                }
                t = t.next;
            }while(t!= head);
            if(t == null){
                return false;
            }
            else{
                return false;
            }
        }
    }
    public void display(){
        if(head == null){
            System.out.println("LL is empty!!");
            return;
        }
        Node t = head;
        do{
            System.out.print(t.val+" -> ");
            t = t.next;
        }while(t!= head);
        System.out.println("End");
    }
    public int getSize(){
        return size;
    }
}
