public class Main {

    static int[] q = new int[5];
    static int front = -1, rear = -1;
    public static void main(String[] args) {
        display();
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        display();
        enqueue(6);

        dequeue();
        display();
        dequeue();
        display();

    }

    public static void enqueue(int a){
        if(front == -1 && rear == -1){
            front ++;
        }

        if(!isFull()){
            rear++;
            q[rear] = a;
        }else{
            System.out.println("Queue is Full!");
        }

    }

    public static void dequeue(){
        if(front >= 0){
            System.out.println("Dequeued: "+q[front]);
        }

        if(front == rear){
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }
    public static void display(){
    if(!isEmpty()){
        for(int i = front; i <= rear; i++){
            System.out.print(q[i]+ " ");
        }
        System.out.println();
    } else{
        System.out.println("Queue is empty!");
    }
    }
    public static boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        return  false;
    }
    public static boolean isFull(){
        if(rear == q.length-1){
            return true;
        }
        return false;
    }

}