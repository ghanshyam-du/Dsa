public class Main {
    public static void main(String args[]) {
        linkedlist list = new linkedlist(); // Correct class name

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(18);
        list.insertMiddle(26, 3);

        System.out.println("Is 18 in the list? " + list.searchLL(18)); // Fix
        System.out.println("The length of size"+ list.getSize());
        System.out.println("The triversal: "+ list.triversal());

        list.display();
    }
}
