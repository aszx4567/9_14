package abst;

public class Dog2 extends Animal2{
	
	public Dog2() {
	    kind = "������ ����";
	}
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
	
	public void run() {
		System.out.println(kind + " �������� �޸��ϴ�.");
	}
	
}
