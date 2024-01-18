import java.util.*;
public class q1{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        System.out.println("the sum of"+a+"numbers are:"+sum(a));
    }
}