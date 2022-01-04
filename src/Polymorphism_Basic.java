class Plane
{
	 void fly() {
		System.out.println("palne is flying");
	}
}
class Cargoplane extends Plane{
	void fly() {
	System.out.println("Cargoplane flies at lower heights");
	}
}
class Passengerplane extends Plane{
	void fly() {
		System.out.println("Passengerplane flies at medium heights");
	}
}
class Fighterplane extends Plane{
	void fly() {
		System.out.println("Fighterplane flies at greater heights");
	}
}

public class Polymorphism_Basic {

	public static void main(String[] args) {
		Cargoplane cp = new Cargoplane();
		Passengerplane pp = new Passengerplane();
		Fighterplane fp = new Fighterplane();
		Plane ref=new Plane();
		ref=cp;
		ref.fly();
		ref=pp;
		ref.fly();
		ref=fp;
		ref.fly();		

	}

}
