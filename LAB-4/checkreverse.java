import java.util.Scanner;
public class checkreverse
{
  public static void reverse(int[] a,int x,int y) 
  { 
    while(x<y) 
    { 
      int temp = a[x]; 
      a[x] = a[y]; 
      a[y] = temp; 
      x++; 
      y--; 
    } 
  } 
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size of the array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements: ");
    
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    sc.close();
    //printing the array elements
    System.out.print("\nThe entered Array is:{ ");
    for (int i : arr) {
      System.out.print(i + ", ");
    }
    System.out.println("\b\b }");

    //checks the index of reverse subarray
    int x = -1; 
    int y = -1; 
  
    for (int i = 0; i < n - 1; i++) 
    { 
      if (arr[i] > arr[i + 1]) 
      { 
        if (x == -1)
        { 
          x = i; 
        } 
        y = i + 1; 
      } 
    } 
    boolean flag=true;
    //reverses the subarray and then checks if array is sorted 
    for (int i = 0; i < n - 1; i++) 
    { 
      if (arr[i] > arr[i + 1]) 
      { 
        if (x == -1) 
        { 
          x = i; 
        } 
        y = i + 1; 
      } 
    } 
  
    if (x != -1) 
    { 
      reverse(arr,x,y); 
      for (int i = 0; i < n - 1; i++) 
      { 
        if (arr[i] > arr[i + 1]) 
        { 
          flag= false; 
        } 
      } 
    } 
    //printing he result
    if(flag)
    {
      System.out.print("Yes reversing { ");
      for(int i=y;i>=x;i--)
      System.out.print(arr[i]+", ");
      System.out.println("\b\b } makes it sorted");
    } 
    else
    System.out.println("No reversing any subarray doesnot make it sorted.");
   
  }
}
