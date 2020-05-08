package General;

import java.util.Arrays;

public class Prctice {

	public static void main(String[] args) {
		int s [] = {2,11,1,5,3,14};
		int del = 3;
		
		for(int i = 0;i<s.length;i++)
		{
			if(s[i]==del)
			{
				for(int j =i;j<s.length-1;j++)
				{
			   s[j]=s[j+1];
			  
//				}
				 break;
			}
		}
//		for(int i =0;i<s.length-1;i++)
//		{
	System.out.println(""+s[i]);
//		}
	}
	}

}
