package code;

import java.util.Stack;

public class Skill {

	public static void main(String[] args) {
//		String str = "first";
//		System.out.println(str+1+2+3);
//		System.out.println(str+"1"+2+3);
//		System.out.println(str+1+(2+3));
		
//		int x = 9;
//		if(x==9) {
//			x = 6;
//			System.out.println(x);
//		}
		
		Stack stc = new Stack();
		stc.push(3);
		stc.push(5);
		stc.pop();
		stc.push(7);
		System.out.println(stc);
	}

}
