
public class Test5 {
	String name;
	int id;
	String password;  //소스 -겟터 셋터 에 들어가서 자동으로 만들수 있다! 
	
	public Test5(String name, int id, String password) {  //소스 -제너레이더컨스트럭터 유징 필드 에서 만들수 있다!
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	String getName() {
//		return name;
//	}
//	
//	void setName(String name) {
//		this.name = name;
//	}
}
