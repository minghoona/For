package array.basic;

public class ArrayInit2 {

	public static void main(String[] args) {
		int score[];
		//score = {2, 4, 7}; // 오류 발생
		score = new int[] {2, 4, 7};	//배열 선언 이후 초기화
		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);
		
		score = new int[] {23, 46, 78};	//다른 배열을 생성하여 대입
		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);

	}

}
