package abst;

public abstract class Animal2 {
	public String kind;  //동물의 종류(개,고양이}
	
	public void breathe() {
        System.out.println("숨을쉽니다");
	}
	
	public abstract void sound();
}
