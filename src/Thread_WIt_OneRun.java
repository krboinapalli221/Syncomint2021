class Code implements Runnable
{
	public void run()
	{
	 
	if(Thread.currentThread().getName()=="Type")
	{ 		
		typing();		
	}	
	else
	{
		saving();
	}
	 
	}
	void typing() {
		try
		{
			System.out.println("Typing Started");
		for(int i=1;i<=5;i++) {
			
			System.out.println("Typing...");
			Thread.sleep(2000);
			
		}
		System.out.println("Typing completed");
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
	}
	void saving() {
		try
		{
			System.out.println("Saving Started");
		for(int i=1;i<=5;i++) {
			
			System.out.println("Saving...");
			Thread.sleep(2000);
			
		}
		System.out.println("Saving completed");
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
	}
}
public class Thread_WIt_OneRun {

	public static void main(String[] args) {
		Code cd1=new Code();
		Thread t1 = new Thread(cd1);
		Thread t2 = new Thread(cd1);
		t1.setName("Type");
		t2.setName("Save");
		t1.start();
		t2.start();

	}

}
