import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of an array:");
        for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();
        }
        int t;
        for(int i=0;i<arr.length;i++){
           for(int j=1;j<arr.length;j++){
                if (arr[j]<arr[j-1]){
                    t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
           }
         }
        System.out.println("the required array is");
         for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
        }
    }
}