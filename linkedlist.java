public class linkedlist{

    private Node head;
    private Node tail;

    private int size;

    public linkedlist(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        node = tail;
    }

    public void insertMiddle(int val,int indx)
    {
       if(indx == 0)
       {
        insertFirst(val);
        return;
       }
       if(indx == size){
        insertLast(val);
        return;
       }

       Node temp = head; // this is at index no 0
       for(int i = 1; i< indx; i++)
       {
        temp = temp.next;
       }
       Node node = new Node(val, temp.next);
       temp.next = node;
       size++;

    }

    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print(" END ");
    }

    public void triversal(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){   //Creates a node with a value but doesn't link to any next node (next remains null).
            this.val=val;
        }

        public Node(int val, Node next){  // Creates a node with a value and links it to another node (next points to the given node).
            this.val = val;
            this.next = next;
        }
    }
}