import java.util.*;
public class AppearMaxtimes {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,7,2,6,5,9,13};
		for(int i =0; i< a.length - 1; i++) {
			for(int j =0; j< a.length -i-1;j++ ) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int maxTimes = 0;
		int maxElement =a[0];
		for(int i = 0; i < a.length -1; i++) {
			int j  =i;
			int count =0;
			while(a[j] == a[j+1]) {
				count++;
				if(count > maxTimes) {
					maxTimes = count;
					maxElement= a[j];
				}
				j++;
				i++;
				
			}
		}
		
		System.out.println("Max Element: "+maxElement);

	}

}