package code;

import java.util.Arrays;

public class Tata {

	public static void main(String[] args) {
       String s= "butterbjttfd";
       char d[] = s.toCharArray();
       int l = d.length,i;
       for( i = 0;i<d.length;i++)
       {
    	   for(int j=l+1;j<d.length;j++ )
    	   {
    		   if(d[i]==d[j])
    		   {
    			   System.out.println("value"+Arrays.toString(d));
    		   }
    	   }
       }
	}

}
