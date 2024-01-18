public class Q2 {
    static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        return max;
    }

    static int min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.printf("The max number in the array is %d\n", max(arr));
        System.out.printf("The min number in the array is %d\n", min(arr));
    }
}
