package codebehind;

public class ArmtrongNo {

	public static void main(String[] args) {
		int n= 163,x;
		int r,y=0;
		x=n;
       while(x!=0)
       {
    	 r=x%10;
    	 y= y+r*r*r;
    	 x=x/10;
    			 
       }
       if(y==n)
       {
    	   System.out.println("ArmtrongNo "+n);
       }
       else
       {
    	   System.out.println("Not ArmtrongNo"+n);
       }
    	   
	}

}
