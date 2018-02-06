package com.turbulence6th;

public class Notifier implements Runnable {

	Object message;
	
	Notifier(Object message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (message) {
			message.notifyAll();
		}
	}

}
