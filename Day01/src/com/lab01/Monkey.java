package com.lab01;

public class Monkey {

	private Thread movingThread;
	private boolean awake;
	
	public void move() {
		awake = true;
		movingThread = new Thread(new Runnable() {
			public void run() {
				while(awake) {
					System.out.println("wagging ");
					System.out.println("jumping ");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		movingThread.start();
	}
	
	public void goToSleep() {
		awake = false;
	}
}
