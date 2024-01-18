public class QueueLinkedListImplementation {

    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.display();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.display();
        q.deque();
        q.display();
        q.deque();
        q.display();
    }
}

class LLQueue {
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("Queue is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void enque(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void deque() {
            if(head == tail){
                System.out.println("Dequeued: "+head.data);
                head = null;
                tail = null;
            } else {
                System.out.println("Dequeued: "+head.data);
                head = head.next;
                head.prev = null;
            }
    }

    public void isEmpty(){
        if(head == null){
            System.out.println("Queue is Empty!");
        }
    }

}