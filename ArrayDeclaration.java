package array.basic;

public class ArrayDeclaration {

	public static void main(String[] args) {
		//�迭 ����� ������ �и�
		int[] month;	//int month[];
		double[] values;	//double values[];
		
		//�迭 ����
		month = new int[4];
		values = new double[3];
		System.out.println(month.length);	//month�� �迭 ũ�� ���
		System.out.println(values.length);	//values�� �迭 ũ�� ���
		
		//�迭 ����� ������ �ϳ��� ��������
		char[] ch = new char[6];
		float[] data = new float[5];
		data = new float[7];	//�ٸ� �迭 ��ä�� �����Ͽ� ����
		System.out.println(ch.length);	//ch�� �迭 ũ�� ���
		System.out.println(data.length);	//data�� �迭 ũ�� ���
		

	}

}
