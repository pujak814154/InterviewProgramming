package codebehind;

public class FindDuplicate {

	public static void main(String[] args) {
		int s[]= {2,4,6,7,7,7};
         int leng=s.length;
         int m=0;
         for(int i = 0;i<leng;i++)
         {
        	if(s[i]==7)
        	{
        		m = m+1;
        	}

         }
         System.out.println("duplicateNo print "+ m+" times");
	}

}
