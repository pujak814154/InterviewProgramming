package codebehind;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
//		int  s=1,d=100,i;
//		 for(int x = s;x<=d;x++)
//		 {
//			for( i =2;i<x;i++)
//			
//				if(x%i==0)
//				{
//					break;
//				}
//				if(i==x)
//				{
//					System.out.println("prime no"+x);
//				}
//			
//		 }

		
		
//		Another Way
		
//		int temp, num;
//        boolean isPrime = true;
//        Scanner in = new Scanner(System.in);
//        num = in.nextInt();
//        in.close();
//        for (int i = 2; i<= num/2; i++) {
//            if (num%i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if(isPrime) 
//            System.out.println(num + "number is prime");
//            else
//                System.out.println(num + "number is not a prime");
//             
		
		
		
		
		
		// another way
		int num = 3;
		int count = 0;
		if(num>1)
		{
			for(int i = 1;i<=num;i++)
			{
				
				if(num%i==0)
				
					count++;
				if(count==2)
				{
					System.out.println("prrime ");
				}
				else
				{
					System.out.println("not prie");
					
				}
				
			}
		}
		
		
		
	}

}
