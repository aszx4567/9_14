package abst;

public class Cat2 extends Animal2{
	
	public Cat2() {
		this.kind = "포유류 고양이과";
	}

	@Override
	public void sound() {
		System.out.println(kind + " 야옹");
	}
	
}
