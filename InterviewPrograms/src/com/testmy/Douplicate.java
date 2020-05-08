package com.testmy;

public class Douplicate {
public static void main(String args[])
{
	String stv = "mukeskumarimukesh";
	char s [] = stv.toCharArray();
	for(int i = 0;i<s.length;i++)
	{
		for(int j = i+1;i<s.length;j++)
		{
			if(s[i]==s[j])
			{
				System.out.println("duplicate no = "+s[j]);
				break;
			}
		}
	}
}
}
