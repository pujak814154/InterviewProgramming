package codebehind;

public class Reverce {

	public static void main(String[] args) {
		int n= 41568,x;
		int r,y=0;
		x=n;
       while(x!=0)
       {
    	 r=x%10;
    	 y= y*10+r;
    	 x=x/10;
    			 
       }
       System.out.println("Reverce "+y);
      
	}

}
