public class q2 {

    public static void main(String[] args) {
        int[] arr = {53,84,56,96,54,12};

        int maximum = findMaximum(arr, 0, arr.length - 1);
        int minimum = findMinimum(arr, 0, arr.length - 1);

        System.out.println("Maximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);
    }

    public static int findMaximum(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftMax = findMaximum(arr, start, mid);
            int rightMax = findMaximum(arr, mid + 1, end);

            return Math.max(leftMax, rightMax);
        }
    }

    public static int findMinimum(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftMin = findMinimum(arr, start, mid);
            int rightMin = findMinimum(arr, mid + 1, end);

            return Math.min(leftMin, rightMin);
        }
    }
}