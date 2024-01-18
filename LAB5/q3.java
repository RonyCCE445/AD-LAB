//print the duplicate element in in array 
import java.util.*;

public class q3 {
    public static void findAndPrintDuplicates(int[] arr) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int num : arr) {
           
            if (elementCountMap.containsKey(num)) {
          
                elementCountMap.put(num, elementCountMap.get(num) + 1);
            } else {
                
                elementCountMap.put(num, 1);
            }
        }

      
        for (HashMap.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8};
        findAndPrintDuplicates(arr);
    }
}
