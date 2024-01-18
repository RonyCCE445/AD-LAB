public class Q8 {
    public static void main(String[] args) {
        int n = 15; // Change this to the desired Fibonacci number

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 0;
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            fib = prev + curr;
            prev = curr;
            curr = fib;
        }
        return fib;
    }
}
