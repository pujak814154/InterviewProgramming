package com.testmy;

public class AllWhitespace {

	public static void main(String[] args) {
		String str = "Saket Saurav        is a QualityAna    list";
		  
        //1. Using replaceAll() Method
  
        String str2 = str.replaceAll("\\s", "");
  
        System.out.println(str2);
        
        
        
//        Without replace keyword
        
        String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
        
        char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);   
	}

}
