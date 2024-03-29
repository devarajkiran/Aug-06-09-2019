public class DogThread extends Thread {

	public DogThread(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			walk();
			wag();
		}
	}
	
	private void walk() {
		System.out.println(Thread.currentThread().getName() + " walking");
	}
	
	private void wag() {
		System.out.println(Thread.currentThread().getName() + " wagging");
	}
	
}
