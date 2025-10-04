import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public void push(int item){
        items.add(item);
    }

    public int pop(){
        if(!isEmpty()){
            return items.remove(items.size()-1);
        }
        return 0;
    }
    public int peek(){
        if(!isEmpty()){
            return items.get(items.size()-1);
        }
        return 0;
    }

    public boolean isEmpty(){
        return items.isEmpty();

    }
    public static void main(String args[]){
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("This is the peek element of the stack:"+stack.peek());

        stack.pop();
        stack.pop();
        System.out.println("This is the peek element of the stack:"+stack.peek());
        
    }
}

