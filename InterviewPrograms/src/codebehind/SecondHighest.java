package codebehind;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int no[] = {8,9,4,5,3,10};
        
		for(int i = 0;i<no.length;i++)
		{
//			System.out.println("MinElement "+ no[i]);
		}
//		or
//		Arrays.sort(no);
////		System.out.println("MinElement "+Arrays.toString(no));
//         
//        System.out.println(no[no.length-2]);
        //
        Arrays.sort(no);
    	
//		System.out.println("the sorted element");
//		for(int n:no)
//		{
//			System.out.println(""+n);
//		}
		System.out.println("2nd "+no[no.length-2]);
	}

}
