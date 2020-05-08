package code;

//public class PryinkaDi extends Thread {
//public void run()
//{
//	System.out.println("run method");
//}
//	public static void main(String[] args) {
//	
//		PryinkaDi obj = new PryinkaDi();
//		obj.start();
//	}
//
//}
class Ram implements Runnable{
	Thread t ;
	Ram()
	{
		t = new Thread("my thread");
		t.start();
	}
public void run()
{
	System.out.println(t);
}
}
public class PryinkaDi {
	
	public static void main(String[] args) {
	
		new Ram();
	}

}

