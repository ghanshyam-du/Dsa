class Stlmpl{
    int top = -1;
    int stack[] = new int[10];

    void push(int value){
        if(top == stack.length -1){
            System.out.println("Stack is full");
        }
        else{
            top += 1;
            stack[top] = value;
            System.out.println("Pushed value:" + value);
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped value:" + stack[top]);
            top -= 1;
        }
    }

    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Peeked value:" + stack[top]);
        }
    }

    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements are :");
            for(int i = top; i >= 0; i--){
                System.out.print(stack[i]+" ");
            }
        }
        }
    void size(){
        System.out.println("Size of stack is:"+ (top + 1));
    }
    public static void main(String args[]){
        Stlmpl s = new Stlmpl();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);

        s.push(80);
        s.push(90);
        s.pop();
        s.pop();
        s.peek();
        s.display();
        s.size();

    }
}