package com.testmy;

import java.util.Arrays;

public class Scondhigest {

	public static void main(String[] args) {
		 int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		 for(int i =0;i<arr.length;i++)
		 {
			 System.out.println("element present in array "+arr[i]);
		 }
		 Arrays.sort(arr);
		for(int r :arr)
		{
			System.out.println("sorted element "+r);
		}
		 System.out.println((arr.length)-2);

		 
		 
//		 second way 
		 
//		 int largest = 0;
//	        int secondLargest = 0;
//	        System.out.println("The given array is:");
//	        for (int i = 0; i < arr.length; i++)
//	        {
//	            System.out.print(arr[i] + "\t");
//	        }
//	        for (int i = 0; i < arr.length; i++)
//	        {
//	            if (arr[i] > largest)
//	            {
//	                secondLargest = largest;
//	                largest = arr[i];
//	            }
//	            else if (arr[i] > secondLargest)
//	            {
//	                secondLargest = arr[i];
//	            }
//	        }
//	        System.out.println("\nSecond largest number is:" + secondLargest);
//	        System.out.println("Largest Number is: "  +largest);
//		 
		 
		 
		 
	}

}
