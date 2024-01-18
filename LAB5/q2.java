//implement binARY SEARCH WITH RECURSION
import java.util.*;
public class q2 {
    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right); 
            } else {
                return binarySearch(arr, target, left, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the element you want to search for:");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}
