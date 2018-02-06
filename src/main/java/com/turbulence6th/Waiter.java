package com.turbulence6th;

public class Waiter implements Runnable {
	
	Object message;
	
	Waiter(Object message) {
		this.message = message;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (message) {
			try {
				System.out.println(name + " is waiting to get notified");	
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " is notified");
	}
	
}
