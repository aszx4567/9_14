package abst;

public class Dog2 extends Animal2{
	
	public Dog2() {
	    kind = "포유류 개과";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void run() {
		System.out.println(kind + " 강아지가 달립니다.");
	}
	
}
