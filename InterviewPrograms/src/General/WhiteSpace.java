package General;

import java.util.Arrays;
import java.util.HashMap;

public class WhiteSpace {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		String d = "data table you table you";
		String rep  = "";
		rep = d.replace(" ","");
		System.out.println(rep);
//		String sq[]=d.split(""); //[d, a, t, a,  , t, a, b, l, e,  , y, o, u]
		String sq[]=d.split(" "); //[data, table, you]
		
		for(String y :sq) {
			if(hm.containsKey(y))
			{
				hm.put(y, hm.get(y)+1);
			}
			else
			{
				hm.put(y,1);
			}
//			System.out.println(y);
		}
		System.out.println(hm);
//		System.out.println(Arrays.toString(sq));

	}

}
