public class Q10 {
    public static int findMaxRec(int A[], int n) {

        if (n == 1)
            return A[0];

        return Math.max(A[n - 1], findMaxRec(A, n - 1));
    }

    public static int findMinRec(int A[], int n) {

        if (n == 1)
            return A[0];

        return Math.min(A[n - 1], findMinRec(A, n - 1));
    }

    public static void main(String args[]) {
        int A[] = { 1, 4, 45, 6, -50, 10, 2 };
        int n = A.length;

        System.out.printf("The minimum number in the array is %d\n", findMinRec(A, n));
        System.out.printf("The maximum number in the array is %d\n", findMaxRec(A, n));
    }
}
