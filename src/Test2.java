
public class Test2 {

	public static void main(String[] args) {
		int[] atom1 = {10,20,30};
		int[] atom2 = new int[5];
		for(int i = 0 ; i <atom1.length;i++) {
			System.out.println("atom1["+i+"] = "+atom1[i]);
		}
		for(int i = 0 ; i <atom2.length;i++) {
			System.out.println("atom2["+i+"] = "+atom2[i]);
		}
		/*for(int i=0; i<atom1.length;i++) {
			atom2[i] = atom1[i];
		}
		System.out.println();
		for(int i = 0 ; i <atom2.length;i++) {
			System.out.println("atom2["+i+"] = "+atom2[i]);
		}*/
		System.out.println();
		
		//배열복사 : System.arrcopy(배열1,시작1,배열2,시작2,갯수)
		System.arraycopy(atom1, 0, atom2, 0, atom1.length);
		for(int i = 0 ; i <atom2.length;i++) {
			System.out.println("atom2["+i+"] = "+atom2[i]);
		}
	}
}
