package Company;

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
public class Didi {

	public static void main(String[] args) {
		new Ram();

	}

}
//a my thread b- thread[My thread.5,main] ,c- cte d-rt