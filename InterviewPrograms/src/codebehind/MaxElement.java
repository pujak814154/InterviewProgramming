package codebehind;

public class MaxElement {

	public static void main(String[] args) {
		int no[] = {8,9,4,5,3,10};
        int max = no[0];
		for(int i = 0;i<no.length;i++)
		{
			if(no[i]>=max)
			{
				max = no[i];
			}
		}
		System.out.println("MaxElement "+max);
	}

}
