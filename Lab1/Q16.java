public class Q16 {

    public static int findSmallestMissingNumber(int[] arr) {
        return findSmallestMissingNumberRecursive(arr, 1);
    }

    private static int findSmallestMissingNumberRecursive(int[] arr, int number) {
        if (contains(arr, number)) {
            return findSmallestMissingNumberRecursive(arr, number + 1);
        } else {
            return number;
        }
    }

    private static boolean contains(int[] arr, int number) {
        for (int element : arr) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        int result = findSmallestMissingNumber(arr);
        System.out.println("Smallest positive missing number: " + result);
    }

}
