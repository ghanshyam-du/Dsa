public class Main {
    public static void main(String args[])
    {
        linkedlist list = new linkedlist();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(18);
        list.insertMiddle(26, 3);
        list.triversal(head);

        list.display();
    }
}
