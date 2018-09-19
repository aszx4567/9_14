package abst;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void run() {
		System.out.println("강아지가 달립니다.");
	}
	
}
