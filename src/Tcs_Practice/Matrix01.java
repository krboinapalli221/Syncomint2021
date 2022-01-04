package Tcs_Practice;

public class Matrix01 {

	public static void main(String[] args) {
		int[][] a= new int[5][5];
		 int n1=1;
		 int n2=1;
		 int k=n1;
		 int n3;
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
				
				a[i][j] = ((k)*(k+1)*(k+2))/6;
				k++;
			
		}
		n3=n1+n2;
		n1=n2;
		n2=n3;
		k=n2;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		
		}
	}

}
