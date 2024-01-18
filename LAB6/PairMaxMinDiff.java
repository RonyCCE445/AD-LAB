public class PairMaxMinDiff {

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
		
		System.out.println("Pair with the max difference is: {"+a[0]+", "+a[a.length -1]+"}");
		int min = Integer.MAX_VALUE;
		int x = a[0],y = a[0];
		for(int i =0; i< a.length-1; i++) {
			if((a[i+1] - a[i]) < min) {
				min = a[i+1] - a[i];
				x = a[i];
				y = a[i+1];
			}
			
			
		}
		
		System.out.println("Pair with the min difference is: {"+x+", "+y+"}");

	}

}