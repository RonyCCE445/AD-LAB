
public class FirstRepeatedElement {

	public static void main(String[] args) {
		int a[] = {3,2,4,7,4,56,1,7,1};
		boolean flag = false;
		for(int i =0; i< a.length; i++) {
			for(int j = i+1; j< a.length;j++ ) {
				if(a[i] == a[j]) {
					flag = true;
					System.out.println("The first repeated element is: "+a[i]);
					break;
				}
				if(flag) {
					break;
				}
			}
		}
		
		if(!flag) {
			System.out.println("no repeated elements");
		} 
       
	}

}