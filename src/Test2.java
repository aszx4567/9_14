
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
		
		//�迭���� : System.arrcopy(�迭1,����1,�迭2,����2,����)
		System.arraycopy(atom1, 0, atom2, 0, atom1.length);
		for(int i = 0 ; i <atom2.length;i++) {
			System.out.println("atom2["+i+"] = "+atom2[i]);
		}
	}
}
