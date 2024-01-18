import java.util.*;
public class stack_A{
    static class stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public static boolean is_Empty(){
            return list.size()==0;
        }
        public static void push (int data){
            list.add(data);
        }
        public static int pop(){
            if(is_Empty()){
                return-1;}
                int pop=list.get(list.size()-1);
                list.remove(list.size()-1);
                return pop;
        }
        public static int peek(){
            if ( is_Empty()){
                return-1;

            }
            return list.get(list.size()-1);
        }
            
       
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.is_Empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}