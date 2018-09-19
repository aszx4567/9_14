package abst;

import java.util.Scanner;

public class child {

	public static void main(String[] args) {
		sikdan sik = new sikdan();
		Scanner scan = new Scanner(System.in);
		int sikdan1 = 4000;
		while(true) {
			System.out.println("식단 단가 계산 프로그렘");
			System.out.println("밥[1000원] 과 불고기[3000원] 은 기본 입니다.");
		    System.out.println("두부조림을 선택하시겠습니까?  선택하면1 아니면 0 을 입력해주세요");
		    int dobu1 = scan.nextInt();
		    
		    if(dobu1 == 1) {
		    	sikdan1 +=  sik.dobo();
		    }
		    System.out.println("미역국을 선택하시겠습니까?  선택하면1 아니면 0 을 입력해주세요");
		    int mi1 = scan.nextInt();
		    if(mi1 == 1) {
		    	sikdan1 += sik.mi();
		    }
		    System.out.println("간식을 선택합니다.");
		    System.out.println("요플레를 선택하시겠습니까?  선택하면1 아니면 0 을 입력해주세요");
		    int ypr = scan.nextInt();
		    if(ypr == 1) {
		    	sikdan1 += sik.ypr();
		    }
		    System.out.println("바나나를 선택하시겠습니까?  선택하면1 아니면 0 을 입력해주세요");
		    int banana = scan.nextInt();
		    if(banana == 1) {
		    	sikdan1 += sik.banana();
		    }
		    System.out.println("우유를 선택하시겠습니까?  선택하면1 아니면 0 을 입력해주세요");
		    int milk = scan .nextInt();
		    if(milk == 1) {
		    	sikdan1 += sik.milk();
		    }
		    System.out.println("아몬드를 선택하시겠습니까?  선택하면1 아니면 0 을 입력해주세요");
		    int amond = scan.nextInt();
		    if(amond ==1) {
		    	sikdan1 += sik.amond();
		    System.out.println("총 식단의 가격은"+sikdan1+"원 입니다.");
		    break;
		    }
		}
			
	}

}
