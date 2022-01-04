
public class This_super {

	public static void main(String[] args) {
		Test4 t = new Test4();   
        t.disp();
	}
}
		class Test3{
			int x,y;
			Test3(){
				x = 100;
				y = 200;
				System.out.println(x);
				System.out.println(y);
				
				
			   }
			Test3(int x,int y){
				this();
				this.x = x;
				this.y = y;
				
			}
		}
		class Test4 extends Test3{
			int a,b;
			Test4(){
				super(50,60);
				a=300;
				b=400;
			} 
			
			
			void disp(){
				System.out.println(x);
				System.out.println(y);
				System.out.println(a);
				System.out.println(b);
				
			}/* this() is used to call constructor in the same class 
			    where super() is used to call constructor of other class
			      it is used while inheritance*/
		
		

	}


