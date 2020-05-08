package codebehind;

public class PalindromNo {

	public static void main(String[] args) {
		int n= 121,x;
		int r,y=0;
		x=n;
       while(x!=0)
       {
    	 r=x%10;
    	 y= y*10+r;
    	 x=x/10;
    			 
       }
       if(y==n)
       {
    	   System.out.println("PalindromNo "+n);
       }
       else
       {
    	   System.out.println("Not PalindromNo "+n);
       }
    	   

	}

}
