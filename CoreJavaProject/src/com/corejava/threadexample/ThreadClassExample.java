package com.corejava.threadexample;


public class ThreadClassExample extends Thread{

	//Thread t = null;	
	String name = null;
	
	public ThreadClassExample(String  threadName){
		
		super(threadName);
		
		System.out.println("I am creating new  Thread " + threadName);
		
	
		name = 	threadName;
		
	}
	
	
		
	public void run() {
		
		System.out.println("i am in running Thread name "+name + " Priority "+ Thread.currentThread().getPriority());
		
		for(int i = 0; i < 4 ; i++){
			
			System.out.println("Thread name :  "+name+" i : "+ i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				System.out.println(" caught Exception : " + e);
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		ThreadClassExample ex = new ThreadClassExample("MyfirstThread");
		
		ex.setPriority(Thread.MIN_PRIORITY);
				
		ex.run();
		
		ThreadClassExample thread2 = new ThreadClassExample("MySecondThread");
		
		thread2.setPriority(Thread.MAX_PRIORITY);
	
		thread2.start();
		
		ThreadClassExample thread3 = new ThreadClassExample("MyThridThread");
		
		thread3.setPriority(6);
	
		thread3.start();
		
		
		

	}

}
