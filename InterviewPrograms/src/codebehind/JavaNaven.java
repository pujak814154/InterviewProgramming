package codebehind;

import java.util.HashMap;

public class JavaNaven {

	public static void main(String[] args) {
		String  s[] = {"java","ruby","jvscript","database","java"};
		
//		for(int i= 0;i<s.length;i++)
//		{
//			for(int j = i+1;j<s.length;j++)
//			{
//				if(s[i].equals(s[j]))
//				{
//					System.out.println("douplicate "+s[j]);
//				}
//			}
//		}
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(String st :s)
		{
			if(hm.containsKey(st))
			{
				hm.put(st,hm.get(st)+1);
				
			}
			else
			{
				hm.put(st, 1);
			}
			
		}
	System.out.println(hm);
	}

}
