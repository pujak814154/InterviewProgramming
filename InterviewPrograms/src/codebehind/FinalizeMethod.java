package codebehind;

public class FinalizeMethod {
	public void finalize()
	{
		System.out.println("i am fnalize method");
	}

	public static void main(String[] args) {
		FinalizeMethod f1 = new FinalizeMethod();
		FinalizeMethod f2 = new FinalizeMethod();
		f1 = null;
		f2 = null;
		System.gc();
		
	}

}
