
class Box {
	int height;int width;int length;
		int volume;
	void volume(int height,int width,int length) {
		volume = width*height*length;
		
	}
}
	
public class String_Volume_Exam{

	public static void main(String[] args) {
		Box obj = new Box();
		obj.height = 1;
		obj.length = 5;
		obj.width = 5;
		obj.volume(3,2,1);
		System.out.println(obj.volume);
			
		
		

	}

}
