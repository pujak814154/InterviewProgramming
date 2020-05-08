package codebehind;

public class ReversStrng {

	public static void main(String[] args) {
		String str = "abdsea";
		int leng = str.length();
		String rever = "";
      for(int i = leng-1;i>=0;i--)
      {
    	  rever= rever+str.charAt(i);
      }
      System.out.println("ReversStrng "+rever);
      
	}

}
