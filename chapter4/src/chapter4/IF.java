package chapter4;

public class IF {
	public static void main(String[] args) {

//EX1
//				int age = 7;
//				if (age >= 8) {
//					System.out.println("�б��� �ٴմϴ�");
//				}
//					else {
//						System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
//				}
			
		//EX2
//				char gender = 'F';
//				if (gender == 'F') {
//					System.out.println("�����Դϴ�.");
//				}
//				else {
//					System.out.println("�����Դϴ�.");
//				}

//EX3
		int age = 18;
		int charge ;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("�߰���л� �Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
					}
			System.out.println("������ "+charge+"�� �Դϴ�.");
			
	}
	

}
