import java .util.*;
public class q6 {
    public static int g(int a, int b){
        if (b==0)
        return a;
        return g(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int b=sc.nextInt();
        System.out.println("enter the number:");
        int p=sc.nextInt();
        System.out.println("gcd:"+g(b,p));
    }
}
