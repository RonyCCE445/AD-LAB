
import java.util.*;

public class q8 {

    static int solution(int[] A) {
        int n = A.length;

        int N = 1000010;

        boolean[] present = new boolean[N];

        int maxele = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (A[i] > 0 && A[i] <= n)
                present[A[i]] = true;

            maxele = Math.max(maxele, A[i]);
        }

        for (int i = 1; i < N; i++)
            if (!present[i])
                return i;

        return maxele + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 10, 2, -10, -20 };
        System.out.println(solution(arr));
    }
}