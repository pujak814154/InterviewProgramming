package com.testmy;

public class SplitData {

	public static void main(String[] args) {
//		String dat =  " foo boo, faa baa, fii bii,";
//		String[] result = {"foo boo", "faa baa", "fii bii"};
//	System.out.println(dat.trim());
//		String[] result1 = dat.split(",");
//		System.out.println(result1);

		String st = "india";
		int c =0;
		for(int i =0;i<st.length();i++)
		{
			if(st.charAt(i)=='i')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
