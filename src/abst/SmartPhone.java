package abst;

public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner); 
	}
	public void internetSearch(){
		System.out.println("인터넷에서 검색합니다");
	}
}
