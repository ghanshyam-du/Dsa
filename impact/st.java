public class st {
    int size =100;
    int[] stack = new int[size];
    int top = -1;
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " to stack");
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = stack[top--];
            System.out.println("Popped " + value + " from stack");
            return value;
        }
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        st stack = new st();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
