package operator;

public class Ex2 {
	public static void main(String[] args) {
		int gameScore = 150; //게임에서 획득한 점수는 150점
		
		int lastScore1 = gameScore++; // gameScore에 1더한 값을 lastScore1에 대입
		System.out.println(lastScore1); // 151
		
		int lastScroe2 = gameScore--; // gameScore에서 1 뺀 값을 lastScore2에 대입
		System.out.println(lastScroe2); // 150
		

	}

}
