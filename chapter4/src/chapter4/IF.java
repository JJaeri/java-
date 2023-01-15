package chapter4;

public class IF {
	public static void main(String[] args) {

//EX1
//				int age = 7;
//				if (age >= 8) {
//					System.out.println("학교에 다닙니다");
//				}
//					else {
//						System.out.println("학교에 다니지 않습니다.");
//				}
			
		//EX2
//				char gender = 'F';
//				if (gender == 'F') {
//					System.out.println("여성입니다.");
//				}
//				else {
//					System.out.println("남성입니다.");
//				}

//EX3
		int age = 18;
		int charge ;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
					}
			System.out.println("입장료는 "+charge+"원 입니다.");
			
	}
	

}
