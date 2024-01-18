public class reduction {

  static int findMin(int[] x) {
    int min = Integer.MAX_VALUE;
    for (int i : x) {
      if (i < min && i != 0) min = i;
    }
    if (min == Integer.MAX_VALUE) return 0;
    return min;
  }

  public static void printArray(int[] x) {
    System.out.print("{ ");
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + ", ");
    }

    System.out.println("\b\b }");
  }

  public static void main(String[] args) {
    int[] a = { 5, 1, 1, 1, 2, 3, 5 };
    int c = 0;
    printArray(a);

    boolean flag = true;
    while (flag) {
      int sub = findMin(a);
      for (int i = 0; i < a.length; i++) {
        if (sub == 0) {
          flag = false;
          break;
        } else {
          if ((a[i] - sub) <= 0) a[i] = 0; else a[i] = (a[i] - sub);
        }
      }
      if (flag) {
        c = c + 1;
        printArray(a);
      }
    }
    System.out.println("Number of time reduced: "+c);
  }
}
