package code;

import java.util.HashMap;

public class TestDta {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		String str = "Java J2EE Java JSP J2EE";
		char d[]= str.toCharArray();
        for(char c :d)
        {
        	if(hm.containsKey(c))
        	{
        		hm.put(c,hm.get(c)+1);
        		
        	}
        	else {
        		hm.put(c,1);
			}	
        		
        	}
        System.out.println(hm);
        }
	}


