import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int p=sc.nextInt();
        System.out.println("factoraial of the number is:"+fact(p));
    }
    public static int fact(int y){
         if(y==1 || y==1)
         return 1;
         else
         return y*fact(y-1);
    }
}
