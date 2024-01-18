import java.util.*;
public class stack_B {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node head=null;
        public static boolean is_Empty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(is_Empty()){
                head=newNode;
                return;

            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(is_Empty()){
                return-1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(is_Empty()){
                return-1;
            }
            return head.data;
        }
    }
    public static void main(String[]args){
        stack s=new stack();
        s.push(1); s.push(2); s.push(3);
        while(!s.is_Empty()){
            System.out.println(s.peek());
            s.pop();
        }
        

    }
}

