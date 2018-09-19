import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name[] = new String[100];
		int arr[][] = new int[100][6];
		
	
			System.out.println("====================================");
			System.out.println("성적관리에 오신걸 환영합니다");
			System.out.println("====================================");
			for( int i = 0; i<arr.length ; i++) {
				System.out.println("이름, 국어, 영어 ,수학 순으로 입력해 주세요 [end입력시 종료]");
				name[i] = scan.nextLine();
				if (name[i].equals("end")) {
					break;
				}else {
					for(int j = 0; j < arr[i].length -3 ; j++) {
						System.out.print("점수를 입력하세요: ");
					    arr[i][j] = scan.nextInt();
					    scan.nextLine();
					}
					arr [i][3] = arr[i][0]+arr[i][1]+arr[i][2];
					arr[i][4] = arr[i][3] / 3;
				}
			}
			for(int i = 0; i<=arr.length;i++) {
				int cnt = 0;
				for(int j = 0; i<=arr.length; i++) {
					if(arr[i][4] <= arr[j][4]) {  
						cnt++;
					}
				arr[i][5] = cnt;
				}
			}
			System.out.println("\t\t\t성적표");
		    System.out.println("성명\t국어\t영어\t수학\t총점\t평균\t순위");
		    for(int i=0;i<arr.length;i++) {
		        if(name[i].equals("end")) {
		          break;
		        }else {
		          System.out.print(name[i]+"\t");
		          for(int j=0;j<arr[i].length;j++) {
		            System.out.print(arr[i][j]+"\t");
		          }
		          System.out.println();
		        }
		    }
		    scan.close();
			
			
		

	}

}
