package abst;

import java.util.Scanner;

public class child {

	public static void main(String[] args) {
		sikdan sik = new sikdan();
		Scanner scan = new Scanner(System.in);
		int sikdan1 = 4000;
		while(true) {
			System.out.println("�Ĵ� �ܰ� ��� ���α׷�");
			System.out.println("��[1000��] �� �Ұ��[3000��] �� �⺻ �Դϴ�.");
		    System.out.println("�κ������� �����Ͻðڽ��ϱ�?  �����ϸ�1 �ƴϸ� 0 �� �Է����ּ���");
		    int dobu1 = scan.nextInt();
		    
		    if(dobu1 == 1) {
		    	sikdan1 +=  sik.dobo();
		    }
		    System.out.println("�̿����� �����Ͻðڽ��ϱ�?  �����ϸ�1 �ƴϸ� 0 �� �Է����ּ���");
		    int mi1 = scan.nextInt();
		    if(mi1 == 1) {
		    	sikdan1 += sik.mi();
		    }
		    System.out.println("������ �����մϴ�.");
		    System.out.println("���÷��� �����Ͻðڽ��ϱ�?  �����ϸ�1 �ƴϸ� 0 �� �Է����ּ���");
		    int ypr = scan.nextInt();
		    if(ypr == 1) {
		    	sikdan1 += sik.ypr();
		    }
		    System.out.println("�ٳ����� �����Ͻðڽ��ϱ�?  �����ϸ�1 �ƴϸ� 0 �� �Է����ּ���");
		    int banana = scan.nextInt();
		    if(banana == 1) {
		    	sikdan1 += sik.banana();
		    }
		    System.out.println("������ �����Ͻðڽ��ϱ�?  �����ϸ�1 �ƴϸ� 0 �� �Է����ּ���");
		    int milk = scan .nextInt();
		    if(milk == 1) {
		    	sikdan1 += sik.milk();
		    }
		    System.out.println("�Ƹ�带 �����Ͻðڽ��ϱ�?  �����ϸ�1 �ƴϸ� 0 �� �Է����ּ���");
		    int amond = scan.nextInt();
		    if(amond ==1) {
		    	sikdan1 += sik.amond();
		    System.out.println("�� �Ĵ��� ������"+sikdan1+"�� �Դϴ�.");
		    break;
		    }
		}
			
	}

}
