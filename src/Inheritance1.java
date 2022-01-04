
	class Test1{
		int x,y;
		Test1(){
			x = 100;
			y = 200;
			
		}
		Test1(int x,int y){
			this.x = x;
			this.y = y;
			System.out.println(x);
			System.out.println(y);
		}
	}
	class Test2 extends Test1{
		int a,b;
		Test2(){
			a=300;
			b=400;
		}
		Test2(int a,int b){
			this.a = a;
			this.b = b;
		}
		void disp(){
			System.out.println(x);
			System.out.println(y);
			System.out.println(a);
			System.out.println(b);
			
		}
	}
	public class Inheritance1{

	public static void main(String[] args) {
		Test2 t = new Test2();   /* the variables ,method which are declared as private in 
		                             one class can't be accessed by the other class even in inheritance also*/
		t.disp();

	}

}
