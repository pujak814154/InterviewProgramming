package Company;
  
   class daa
  {
	   public int x ;
	   public int y ;
	     daa(int a,int b)
	     {
	   	 x = a;
	   	 y = b;
	     }
	     public void da()
	     {
	    	System.out.println(x+" "+y); 
	     }
  }

public class DataTest {

	public static void main(String[] args) {
		daa oj = new daa(2,3);
		oj.da();
		
     
	}

}
