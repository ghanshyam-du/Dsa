public class QueueImpl {
    int front = -1;
    int rear = -1;
    int size = 5;
    int queue[] = new int[size];

    void enqueue(int value){
        if(rear == size - 1){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1){
                front = 0;
                rear = 0;

            }
            else{
                rear = (rear + 1) % size;
            }
            queue[rear] = value;
            size++;
            System.out.println("Enqueued value:" + value);
        }
    }
    void dequeue(){
        if(front == -1){
            System.out.println("Queue is empty");
        }

        else{
            System.out.println("Dequeued value:" + queue[front]);
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front + 1) % size;
            }

        }
    }
    void peek(){
        if(front == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Peeked value:" + queue[front]);
        }
    }

    void display(){
        if(front == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue element are :");
            for(int i = front; i != rear; i=(i+1)%size){
                System.out.print(queue[i]+" ");
            }
        }
    }

    public static void main(String args[]){
        QueueImpl q = new QueueImpl();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        

        q.dequeue();
        q.dequeue();
        q.peek();
        q.display();
    }
}
