import java.util.*;
class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;


    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        
    }
    
    public void push(int x) {
        s1.push(x);
        
    }
    
    public int pop() {
        if(s2.size() == 0){
           for(int i = 0; i< s1.size(); i++){
                s2.push(s1.pop());
            }
        }
         return s2.pop();
        
    }
    
    public int peek() {
       if(s2.size() == 0){
            for(int i = 0; i< s1.size(); i++){
                s2.push(s1.pop());
            }
        }
         return s2.peek();
        
    }
    
    public boolean empty() {
        
       return s2.isEmpty();
    }

    public static void main(String args[]){
        
    }
}

