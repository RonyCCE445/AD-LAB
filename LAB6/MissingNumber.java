public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,7,6,5,9,13};
		for(int i =0; i< a.length - 1; i++) {
			for(int j =0; j< a.length -i-1;j++ ) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length -1; i++) {
			if(a[i]+1 != a[i+1]) {
				System.out.println((a[i]+1)+" is a missing number");
				a[i] = a[i]+1;
				i--;
			}
		}

	}

}