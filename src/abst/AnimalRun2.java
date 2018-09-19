package abst;
public class AnimalRun2 {
	public static void main(String[] args) {
		Dog2 dog2 = new Dog2 ();
		dog2.sound();
		dog2.run();
		System.out.print(dog2.kind+" : ");
		dog2.breathe();
		
		System.out.println();
	
		Cat2 cat2 = new Cat2();
		cat2.sound();
		System.out.print(cat2.kind+" : ");
		cat2.breathe();
		
		Animal2 dog3 = new Dog2	();
		dog3.sound();
		
		Dog2 dog4 = (Dog2) dog3;
		dog4.run();
	}
}