class Charger
{
	private String brand;
	private int voltage;
	Charger(String brand,int voltage){
		this.brand=brand;
		this.voltage=voltage;
	}
	String getBrand() {
		return brand;
	}
	int getVoltage() {
		return voltage;
	}
}

final class Os
{
	private String name;
	private int version;
	Os(String name,int version){
		this.name=name;
		this.version= version;
		
	}
	String getName() {
		return name;
	}
	int getVersion() {
		return version;
	}
}
final class Mobile
{
	Os os=new Os("Android",6);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class Compo_Aggreg {
	

	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("Redmi",45);
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		m.hasA(c);
		

	}

}
