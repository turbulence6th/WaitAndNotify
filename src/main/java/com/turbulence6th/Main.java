package com.turbulence6th;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Object message = new Object();
		
		Stream.generate(() -> message).limit(10).map(Waiter::new).map(Thread::new).forEach(Thread::start);
		
		new Thread(new Notifier(message)).start();

	}

}
