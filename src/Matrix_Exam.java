
public class Matrix_Exam {

	public static void main(String[] args) {
	int N=20;
	int[] a = new int[N];
	int[][] b= new int[N][N];
	int n = 1;
	int n1=1;
	int n2=1;
	int n3;
	int k=1;
	int s=0;
	
	for(int i=0;i<a.length;i++) {
		a[i]=((n)*(n+1)*(n+2))/6;
		n++;
	}//Created a one dimensional array of tetrahedral numbers
	
	for(int i=0;i<b.length;i++) {		 
		for(int j=0;j<b[i].length;j++) {
			b[i][j]=s+k;//Adding the differences of the numbers in the 1-D array i.e 'a'
			s=b[i][j];
			if(j<a.length-1) {
				k=a[j+1]-a[j];
				}		  
		}		
		n3=n1+n2;
		n1=n2+1;
		n2=n3;	//producing fibonacci series in the column-1	
		k=0;
		s=n1;		
	}	
	
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++) {
			System.out.format("%6d",b[i][j]);
		}
		System.out.println(" ");
	}
	// Phase 2:
	int[] a1=new int[100];
	for(int i=0;i<19;i++)
	{
		for(int j=0;j<19;j++) {
			if(i==j) {
				if(b[i][j]==b[i][j+1]) {
					a1[i]=b[i][j];
				}
			}
		}
		
	}
	for(int i=0;i<99;i++) {
		System.out.println(a1[i]);
	}
	
	
	

	/*
	for(int i=0;i<2;i++) {
		
		for(int j=0;j<10;j++) {
			b[i][j] = n1+k;
			
			n1=b[i][j];
			if(j<a.length-1) {
				k=a[j+1]-a[j];
				}
			
		}
		n1=2;
		k=0;
	}
for(int i=0;i<2;i++) {
		
		for(int j=0;j<10;j++) {
			System.out.print(" "+b[i][j]);
		}
		System.out.println();
		
	} */
	
	}
}
