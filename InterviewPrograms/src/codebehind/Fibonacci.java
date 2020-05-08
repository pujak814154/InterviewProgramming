package codebehind;

public class Fibonacci {

	public static void main(String[] args) {
		int a=-1,b=1,c=0;
       int n= 5;
       for(int i = 0;i<=5;i++)
       {
    	   c=a+b;
    	   System.out.println("Fibonacci no "+c);
    	   a=b;
    	   b=c;
       }
	}

}
