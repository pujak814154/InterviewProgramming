package Company;
 class box
 {
	 int wid;
	 int hight;
	 int length;
	 int volume;
	 box()
	 {
		wid = 5;
		hight = 5;
		length = 6;
	 }
	 void volume()
	 {
		 volume = wid*hight*length;
	 }
 }
public class test3 {

	public static void main(String[] args) {
		box obj = new box();
		obj.volume();
		System.out.println(obj.volume);
	}

}
//  o/p = 150
