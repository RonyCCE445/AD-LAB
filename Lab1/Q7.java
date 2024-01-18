import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        System.out.printf("The factorial of the number is %d\n", fact);
    }
}
