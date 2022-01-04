package Access_Specifier;

public class Fibonacci_series {

	public static void main(String[] args) {
		int[] a = new int[11];
		int sum=0;
		for(int i=0;i<10;i++) {
		a[i] = i;			
		}
		for(int j =0;j<10;j++) {
			sum = a[j]+a[j+1];
		}
		
		System.out.println(sum);
	}

}
