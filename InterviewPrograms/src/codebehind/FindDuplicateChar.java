package codebehind;

import java.util.HashMap;

public class FindDuplicateChar {

	public static void main(String[] args) {
		HashMap<Character,Integer> hasmap = new HashMap<Character, Integer>();
		String str = "pudfsgbvbvb";
		char ch []=str.toCharArray();
		for(char chh:ch)
		{
			if(hasmap.containsKey(chh))
			{
				hasmap.put(chh,hasmap.get(chh)+1);
			}
			else
			{
				hasmap.put(chh,1);
			}
			
		}
		System.out.println("FindDuplicateChar "+hasmap);
	}

}
