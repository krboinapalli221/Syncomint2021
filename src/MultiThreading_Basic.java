class Mathematics extends Thread
{
	public void run() {
		try {
		System.out.println("Mathematics Started");
		Thread.sleep(3000);
		System.out.println("Mathematics Closed");
		}
		catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
}
class Addition extends Thread
{
	 public void run() {
		 System.out.println("Addition started");
		 int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);
			System.out.println("Addition Completed");
	 }
}


public class MultiThreading_Basic {

	public static void main(String[] args) {
		Mathematics m= new Mathematics();
		Addition ad=new Addition();
		m.start();
		ad.start();

	}

}
