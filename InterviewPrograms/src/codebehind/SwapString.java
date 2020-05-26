package codebehind;

public class SwapString {

	public static void main(String[] args) {
		String a = "hello"; 
		String b = "world";
		a = a+b;
		System.out.println(a);
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
   System.out.println("after swaping a = "+a+" and b = "+b);
	}

}
