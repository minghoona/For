package array.basic;

public class ArrayBasic {

	public static void main(String[] args) {
		//배열 선언
		double[] points = new double[3];
		
		points[0] = 28;	//첨자가 0에서 3까지 유효
		points[1] = 29;
		points[2] = 30;
		//points[3] = 31; //실행 시 오류 발생
		
		System.out.println(points.length);
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);

	}

}
