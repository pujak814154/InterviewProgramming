package com.testmy;

import java.util.ArrayList;

public class NewclassForCheck {

	public static void main(String[] args) {
		 ArrayList list = new ArrayList();
	        list.add("20");
	        list.add("30");
	        list.add("40");
	        System.out.println(list.get(1));
	        System.out.println(list.indexOf(0));
       for(int i = 0;i<list.size();i++)
       {
    	   System.out.println(list.get(i));
       }
	}

}
