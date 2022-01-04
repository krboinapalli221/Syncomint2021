class SettersAndGetters
{
	private int a;
	private int b;
	void setK() {
		a=12;
		b=13;
	}
	void  setA() {
		a=10;
		b=15;
	}
	int getA() {
		return a;
	}
	int getB() {
		return b;
	}
}
public class Sett_Gett_public {

	public static void main(String[] args) {
		SettersAndGetters sg= new SettersAndGetters();
		sg.setA();
		sg.setK();
		System.out.println(sg.getA());//sg.a is not valid for private variables
		System.out.println(sg.getB());
		/* Doubt:In this example I have override the variable values by 
		 * using another setter method ,which means i have accessed the 
		 * private variables then here where is the security for the private variables*/
	}

}
