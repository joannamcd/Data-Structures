package Queues;

//public class Queues {
    
//}
//QUEUE USING ARRAYS
class Queue{
    int front, rear, size;
    int capacity;
    int array[];

    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull (Queue queue){
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue){
        return(queue.size ==0);
    }

    //add item to queue
    void enqueue(int item){
        if(isFull(this)){
            return;
        }
        this.rear = (this.rear + 1)%this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }

    int dequeue(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    int rear(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }
    

}

public class Queues{
    public static void main(String[] args){
        Queue queue = new Queue(1000);
        System.out.println("*************\n ARRAY IMPLEMENTATION\n ***************");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        
        System.out.println(queue.dequeue() + " dequeued from queue\n");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());

        System.out.println("*************\n LINKED LIST IMPLEMENTATION\n *************");

        Queue2 q = new Queue2();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + ((q.front != null) ? (q.front).key : -1));
        System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).key : -1));
    }
}

//LINKED LIST IMPLEMENTATION:
class QNode{
    int key;
    QNode next;

    public QNode(int key){
        this.key = key;
        this.next = null;
    }
}

class Queue2 {
    QNode front, rear;
 
    public Queue2() { this.front = this.rear = null; }
 
    // Method to add an key to the queue.
    void enqueue(int key)
    {
 
        // Create a new LL node
        QNode temp = new QNode(key);
 
        // If queue is empty, then new node is front and
        // rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
 
        // Add the new node at the end of queue and change
        // rear
        this.rear.next = temp;
        this.rear = temp;
    }
 
    // Method to remove an key from queue.
    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;
 
        // Store previous front and move front one node
        // ahead
        QNode temp = this.front;
        this.front = this.front.next;
 
        // If front becomes NULL, then change rear also as
        // NULL
        if (this.front == null)
            this.rear = null;
    }
}