package com.testmy;

public class Data {

	public static void main(String[] args) {
//		String st = "puja";
//		String s = new String("puja");
//		String sa = "puja";
//		String sd = new String("puja");
//		
//			System.out.println("itral==new "+st==s);
//		   
//			System.out.println("itral equal new"+st.equals(s));
//			System.out.println("itral==itral"+st==sa);
//			System.out.println("new==new"+s==sd);
//			System.out.println("new equal new"+s.equals(sd));
//			System.out.println("itral equal itral"+st.equals(sa));
		
		int[] fisrtElement = {1, 2, 3};      
		 
        int[] secondElement = {4, 5, 6};   
 
        int[] thirdElement = {7, 8, 9};
		int[][] twoDimensionalArray = {fisrtElement, secondElement, thirdElement};
        for (int i = 0; i < twoDimensionalArray.length; i++)
        {
            System.out.print("{");
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
            {
                System.out.print(twoDimensionalArray[i][j] +"\t");
            }
            System.out.print("}");
            System.out.println();
        }
	}

}
