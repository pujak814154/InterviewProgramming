package General;


class A 
{
	static int b =20;
//	A()
//	{
//		System.out.println("prent");
//	}
//	
	
}
public class Data extends A {
	static {
		 int a = 12;
		 System.out.println(a);
	}
//	 static int a = 12;
//	Data()
//	{
//		System.out.println("child");
//	}

	public static void main(String[] args) {
		Data obj = new Data();
	   
		System.out.println(A.b);
//		for(int i =1;i<=5;i++)
//		{
//			System.out.println(i++);
//			
//		}
//				for(int j =1;j<=5;++j) {
//					System.out.println(j++);
//				}
//		
//			
		}
	}



