package General;
     

class Wa
{
	public void m(String g,int b)
	{
		System.out.println("hello");
	}
}
class B extends Wa
{
	public void m(int h)
	{
		System.out.println("hiiii");
	}
}


public class ManiOver {

	public static void main(String[] args) {
		
    B sa = new B();
    sa.m(3);
    sa.m("re",7);
	}

}
