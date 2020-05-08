package General;

import java.util.HashSet;

public class UiqeElem {

	public static void main(String[] args) {
//		HashSet<Character> hs = new HashSet<Character>();
//		String s = " live datw";
//		 boolean result=false;
//		char c[] = s.toCharArray();
//		for (char sw :c) {
//			 for(int i=0;i < s.length();i++)
//		        {
//		            result=hs.add(s.charAt(i));
//		            if (result == false)
//		            break;
//		        }
//		    System.out.println(result); 
//			
			
//		 res=StringDemo.wordcount("   manchester united is also known as red devil ");
		
		
		
//		}
		    
	        boolean result=false;
	        String inputstring="Alve i@wsomm";
	        System.out.println(inputstring);
	        HashSet < Character> uniquecharset= new HashSet();
	        for(int i=0;i < inputstring.length();i++)
	        {
	            result=uniquecharset.add(inputstring.charAt(i));
	            if (result == false)
	            break;
	        }
	    System.out.println(result);  
	}

}
