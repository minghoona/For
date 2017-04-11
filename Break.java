package control.loop;

public class Break {

	public static void main(String[] args) {
		int i = 1;
		for(i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i == 7) break;
		}
		System.out.println();
	}

}
