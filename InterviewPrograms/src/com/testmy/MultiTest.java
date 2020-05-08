package com.testmy;

class A extends Thread
{
	public void run()
	  {
		  System.out.println("hi");
	  }
}

class B extends Thread
{
	public void run()
	  {
		  System.out.println("hi class b");
	  }
}
public class MultiTest{
  
  
	public static void main(String[] args) {
		
    A ob =  new A();
    B o = new B();
    ob.start();
    o.start();
    		
	}

}
