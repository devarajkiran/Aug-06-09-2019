public class Cat implements Runnable {
	
	public void run() {
		while(true) {
			meow();
			stare();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void meow() {
		System.out.println("meow meow by " + 
				Thread.currentThread().getName());
	}
	
	private void stare() {
		System.out.println("ssssshhhhhh " 
				+ Thread.currentThread().getName());
	}
	
}
