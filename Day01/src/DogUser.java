import java.io.IOException;

public class DogUser {

	public static void main(String[] args) throws IOException {
//		System.out.println(Thread.currentThread().getName());
//		Dog snoopy = new Dog();
//		snoopy.move();
		
		System.out.println("This is " + Thread.currentThread().getName());
		
		Cat snow = new Cat();
		Thread snowThread = new Thread(snow);
		snowThread.setName("Snow");
		snowThread.start();
		
		DogThread snoopy = new DogThread("Snoopy");
		snoopy.start();
		
		DogThread rocky = new DogThread("Rocky");
		rocky.start();
		
		System.in.read();
	}

}
