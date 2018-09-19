package abst;

public abstract class Phone {
	public String owner;
	
	public Phone (String owner) {
		this.owner = owner;
		System.out.println(owner+"님 안녕하세요");
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}//end phone class
