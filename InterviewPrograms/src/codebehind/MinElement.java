package codebehind;

public class MinElement {

	public static void main(String[] args) {
		int no[] = {8,9,4,5,3,10};
        int min = no[0];
		for(int i = 0;i<no.length;i++)
		{
			if(no[i]<=min)
			{
				min = no[i];
			}
		}
		System.out.println("MinElement "+min);

	}

}
