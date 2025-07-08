public class prLL {

    Node head;
    public static class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;

        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private static Node convertarr2LL(int[] arr)
    {
        Node head =new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i< arr.length;  i++)
        {
            Node temp =new  Node(arr[i]);
            mover.next = temp;
            mover = temp;

             

        }
        return head;

    }
    public static void travers(Node head){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int length(Node head){
        Node temp = head;
        int length = 0;

        while(temp != null)
        {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void insertatBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        Node head = convertarr2LL(arr);
        System.out.println(head.data);
        insertatBeginning(18);
        travers(head);
        int p = length(head);
        System.out.println("The length of the node is :"+ p);

    }
}
