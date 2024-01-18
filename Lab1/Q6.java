 22 import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        Arrays.sort(array);

        int n = array.length;
        int maxIndex = n - 1;
        int minIndex = 0;
        boolean printMax = true;

        for (int i = 0; i < n; i++) {
            if (printMax) {
                System.out.print(array[maxIndex] + " ");
                maxIndex--;
            } else {
                System.out.print(array[minIndex] + " ");
                minIndex++;
            }
            printMax = !printMax;
        }
    }
}
