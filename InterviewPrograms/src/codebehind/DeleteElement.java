package codebehind;

public class DeleteElement {

	public static void main(String[] args) {
		int no[] = {8,9,4,5,3,10};
        int delet = 3;
        int i;
		for( i = 0;i<no.length;i++)
		{
			if(no[i]==delet)
			{
				for(int j =i;j<no.length-1;j++)
				{
					no[j]=no[j+1];
				}
				break;
			}
		}
		for( i = 0;i<no.length-1;i++)
		{
		System.out.println("RemanseElement "+no[i]);
		}
	}

}
