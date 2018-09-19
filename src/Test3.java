
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m [] = { 12,7,20,5,9,8 };
		for(int i = 0; i<= 4;i++) {
			for(int j = i+1; j<= 5;j++) {
				if(m[i] > m[j]) {
					int tmp = m[i];
					m[i] = m[j];
					m[j] = tmp;
				}
			}
		}
		for(int i = 0; i<m.length ; i++) {
			System.out.println(m[i]);
		}
	

	}

}
