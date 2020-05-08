package com.testmy;

public class NewThread extends Thread{

	public void run()
	{
		System.out.println("one task run");
	}
	public static void main(String[] args) {
		NewThread sd = new NewThread();
		NewThread s = new NewThread();
		NewThread sq = new NewThread();
        sd.start();
        s.start();
        sq.start();
	}

}
