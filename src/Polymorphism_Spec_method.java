class Plane1
{
	void fly() {
		System.out.println("plane is flying");
	}
	
}
class Cargoplane1 extends Plane1{
	void fly() {
		System.out.println("Cargoplane flies at lower heights");
	}
	void carrycargo() {
		System.out.println("Cargoplane carries cargo");
	}
}
class Passengerplane1 extends Plane1{
	void fly() {
		System.out.println("Passengerplane flies at medium heights");
	}
	void carrypassengers() {
		System.out.println("Passenger plane carries passenger");
	}
}
class Fighterplane1 extends Plane1{
	void fly() {
		System.out.println("Fighterplane flies at greater heights");
	}
	void carryweapons() {
		System.out.println("Fighter plane carries Weapons");
	}
}

public class Polymorphism_Spec_method {

	public static void main(String[] args) {
		Cargoplane1 cp = new Cargoplane1();
		Passengerplane1 pp = new Passengerplane1();
		Fighterplane1 fp = new Fighterplane1();
		Plane1 ref;
		ref=cp;
		ref.fly();
		((Cargoplane1)(ref)).carrycargo();//(downcasting) cp.carrycargo();
		ref = pp;
		ref.fly();
		((Passengerplane1)(ref)).carrypassengers();//pp.carrypassengers()
		ref = fp;
		ref.fly();
		((Fighterplane1)(ref)).carryweapons();//fp.carryweapons();


	}

}
