public class Dog {

	public void move() {
		while(true) {
			walk();
			wag();
		}
	}
	
	private void walk() {
		System.out.println("Walking");
	}
	
	private void wag() {
		System.out.println("Wagging");
	}
}
