
public class Test5 {
	String name;
	int id;
	String password;  //�ҽ� -���� ���� �� ���� �ڵ����� ����� �ִ�! 
	
	public Test5(String name, int id, String password) {  //�ҽ� -���ʷ��̴�����Ʈ���� ��¡ �ʵ� ���� ����� �ִ�!
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
