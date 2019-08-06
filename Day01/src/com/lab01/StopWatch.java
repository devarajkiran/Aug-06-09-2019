package com.lab01;

public class StopWatch {
	
	private boolean keepCounting = false;
	private long counter = 0;
	
	public void start() {
		keepCounting = true;
		Runnable runnable = new Runnable() {
			public void run() {
				while(keepCounting) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(".");
					counter++;
				}				
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

	}
	
	public void stop() {
		keepCounting = false;
	}

	public boolean hasStarted() {
		return keepCounting;
	}

	public long getCounter() {
		return counter;
	}
}
