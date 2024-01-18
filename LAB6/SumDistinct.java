import java.util.*;
public class SumDistinct {

	public static void main(String[] args) {
		int a[] = {2,1,3,4,2,1};
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
		int b[] = new int[a.length];
		b[0] = a[0];
		int j =0;
		for(int i =0; i< a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				b[j] = a[i];
				j++;
			}
		}
		if(b[j -1] != a[a.length -1]) {
			b[j] = a[a.length -1];
		}
		System.out.println(Arrays.toString(b));
		
		for(int i =0; i< b.length; i++) {
			for(int k =i; k< b.length;k++ ) {
				if(b[i] != 0 && b[k] != 0 && b[i] != b[k]) {
				System.out.println(b[i]+"+"+b[k]+" = "+(b[i]+b[k]));
				}
			}
		}

	}

}