package codebehind;

import java.util.Arrays;
import java.util.HashMap;

public class Check {

	public static void main(String[] args) {
//	String s1 = "hello";
//	String s2 = "hello";
//	String str= new String("hello");
//	System.out.println(""+str.hashCode());
//	System.out.println(""+s1.hashCode());
//	System.out.println(""+s2.hashCode());
   int h []= {5,8,2,9,1,7};
   int i;
	for( i = 1;i<h.length;i++)
	{
		System.out.println("no of value "+h[i]);	
	}
	Arrays.sort(h);
	System.out.println(Arrays.toString(h));
	System.out.println(h[h.length-2]);
//	
	}

}
