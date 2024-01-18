import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    static int findSmallestPositiveMissingInteger(int[] array) {
        Arrays.sort(array);
        int j, i = 1;
        for (j = 0; j < array.length; j++) {
            if (array[j] == i) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int size;
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int missing = findSmallestPositiveMissingInteger(array);
        System.out.println("The smallest positive missing integer is " + missing);
    }
}
