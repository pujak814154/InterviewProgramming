package General;

public class First {

	public static void main(String[] args) {
		String input ="strss";

		for(char i :input.toCharArray()){
		if(input.indexOf(i)==input.lastIndexOf(i)){
		System.out.println(i);
		break;
		}
		}
	}

}
