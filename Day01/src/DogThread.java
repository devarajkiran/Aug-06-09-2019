public class DogThread extends Thread{

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
		System.out.println("Walking in " + Thread.currentThread().getName());
	}
	
	private void wag() {
		System.out.println("Wagging in " + Thread.currentThread().getName());
	}
	
}
