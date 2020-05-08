package General;

import java.util.HashMap;

public class Firstnonrepetated {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<>();
		String stu = "stress";
	    char st[]= stu.toCharArray();
	    char c;
	    boolean w= false;
//	    if(!w)
//	    {
	    for(char s: st)
	    {
	    	if(hm.containsKey(s))
	    	{
	    		hm.put(s,hm.get(s)+1);
	    	}
	    	else
	    	{
	    		hm.put(s, 1);
	    		System.out.println(hm);
	    		break;
	    	}
//	    }
	    }
	    
        for (int i =0 ; i < stu.length() ; i++ )
        {
            c= stu.charAt(i);
            if( hm.get(c)  == 1 )
            {
            	System.out.println(c);
            }
           
        }
	    
	    
//	    System.out.println(hm);
	}

}
