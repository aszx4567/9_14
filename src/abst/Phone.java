package abst;

public abstract class Phone {
	public String owner;
	
	public Phone (String owner) {
		this.owner = owner;
		System.out.println(owner+"�� �ȳ��ϼ���");
	}
	
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}//end phone class
