public class DogUser {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
//		Dog snoopy = new Dog();
//		snoopy.move();
		System.out.println("This is " + Thread.currentThread().getName());
		DogThread dog = new DogThread();
		dog.start();
	}

}
