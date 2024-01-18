import java .util.*;
public class q5 {
    public static int pow(int n, int p){
        if(p==0)
        return 1;
        else if(p==1)
        return n;
        else
        return n*pow(n,p-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base:");
        int b=sc.nextInt();
        System.out.println("enter the power:");
        int p=sc.nextInt();
        System.out.println("power:"+pow(b,p));
    }
}
