class Car
{
     private String name;
	private int mileage;
	private int cost;
	public Car() {
		name = "BMW";
		mileage = 10;
		cost = 7000000;
		
	}
	public Car(String name,int mileage,int cost) {
		this.name = name;
		this.mileage =mileage;
		this.cost = cost;
		
	}
	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	public int getCost() {
		return cost;
		
	}
}
public class Constructor_overload {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.getName());
		System.out.println(c1.getMileage());
		System.out.println(c1.getCost());
		Car c2 = new Car("Ferrari",5,9000000);
		System.out.println(c2.getName());
		System.out.println(c2.getMileage());
		System.out.println(c2.getCost());
		
		
		
		

	}

}
