package codebehind;

public class MisNoArray {

	public static void main(String[] args) {
		int s[]= {1,2,4,5};
		int sum=0,sum2 = 0,misno=0;
        for(int a= 0;a<s.length;a++)
        {
        	sum = sum+s[a];
        }
        for(int i = 1;i<=5;i++) {
        	sum2 = sum2+i;
        }
//        System.out.println(sum2);
        misno = sum2-sum;
        System.out.println(misno);
	}

}
