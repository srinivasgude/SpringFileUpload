package com.corejava.threadexample;

class MyClass{
	
	String fname ;
	String lname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}

public class RunnableExample extends MyClass implements Runnable{

	Thread t = null;	
	String name = null;
	
	public RunnableExample(String  threadName){
		
		//super(threadName);
		
		System.out.println("I am creating new  Thread " + threadName);
		
	
		name = 	threadName;
		
	}
	
	
	
	public void run() {
		
		System.out.println("i am in running Thread name "+name);
		
		for(int i = 0; i < 4 ; i++){
			
			System.out.println("Thread name :  "+name+" i : "+ i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println(" caught Exception : " + e);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		RunnableExample ex = new RunnableExample("MyfirstThread");
		Thread t = new Thread(ex);
		
		t.start();
				
		RunnableExample thread2 = new RunnableExample("MySecondThread");
		Thread t2 = new Thread(thread2);
		t2.start();

	}

}
