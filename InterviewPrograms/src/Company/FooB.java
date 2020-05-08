package Company;

public class FooB {
  static boolean foo(char c)
  {
	  System.out.println(c);
	  return true;
  }
	public static void main(String[] args) {
		int i = 0;
		for(foo('A');foo('B')&&(i<2);foo('c'))
		{
			i++;
			foo('D');
			
		}
	}

}
