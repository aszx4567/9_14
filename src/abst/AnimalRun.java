package abst;
public class AnimalRun {
	public static void main(String[] args) {
		Dog dog = new Dog ();
		dog.sound();
		dog.run();
	
		Cat cat = new Cat();
		cat.sound();
	}
}