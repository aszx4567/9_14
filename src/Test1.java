
public class Test1 {

	public static void main(String[] args) {
		 //int[][] atom1 =  {{10,20,30},{40,50,60}};
		int[][] atom1 = new int[2][3];
		for(int i = 0; i<atom1.length;i++) {
			System.out.println("atom["+i+"][0]="+atom1[i][0]);
		}
		System.out.println();
		for(int i = 0 ; i < atom1.length ; i++) {
			for(int j = 0; j < atom1[0].length ; j++) {
				System.out.println("atom1["+i+"]["+j+"]="+atom1[i][j]);
			}
		}
		System.out.println();
		String[]atom2 = new String[3];
		atom2[0] = "Java";
		atom2[1] = "Java";
		atom2[2] = "C#";
		if(atom2[0] == atom2[1]) {
			System.out.println("atom2[0]과 atom[1]은 같다");
		}else {
			System.out.println("atom2[0]과 atom[1]은 다르다");
		}
		String[]atom3 = new String[3];
		atom3[0] = "Java";
		atom3[1] = "J++";
		atom3[2] = "C#";
		if(atom3[0] == atom3[1]) {
			System.out.println("atom3[0]과 atom3[1]은 같다");
		}else {
			System.out.println("atom3[0]과 atom3[1]은 다르다");
		}
		String[] atom4 = new String[3];
		atom4[0] = "Java";
		atom4[1] = " Java";
		atom4[2] = new String("Java");
		if(atom4[0] == atom4[2]) { 
			System.out.println("atom4[0]과 atom4[1]은 같다");
		}else {
			System.out.println("atom4[0]과 atom4[1]은 다르다");
		}
	}
}
