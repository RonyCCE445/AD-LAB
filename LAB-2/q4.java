import java.util.*;
public class q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        System.out.println("fibonacci series of"+a+"th series");
        for (int i = 0; i<a ;i++) {
            System.out.print(f(i) + " ");
      }
    }
    public static int f(int y){
         if(y==0)
         return 0;
         if(y==1 || y==2)
         return 1;
         else
         return f(y-1)+f(y-2);
    }
}
