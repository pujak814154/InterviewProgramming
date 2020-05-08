package codebehind;

public class StrngPalidrom {

	public static void main(String[] args) {
		String str = "abcba";
		int leng = str.length();
		String rever = "";
      for(int i = leng-1;i>=0;i--)
      {
    	  rever= rever+str.charAt(i);
      }
      if(rever.equals(str))
      {
    	  System.out.println("StrngPalidrom "+str);
      }
      else
      {
    	  System.out.println(" Not StrngPalidrom "+str);
      }
	}

}
