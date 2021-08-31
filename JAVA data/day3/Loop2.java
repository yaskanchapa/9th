package day3;

public class Loop2 {

	public static void main(String[] args) {
		System.out.println("<구구단 2단 생성 방법1>");

		for(int i=0; i<9; i++) {
			System.out.println("2×" + (i+1) + " = " + 2*(i+1));
		}

		System.out.println("<구구단 2단 생성 방법2>");

		for(int i=1; i<10; i++) {
			System.out.println("2×" + i + " = " + 2*i);

		}

		System.out.println("<구구단 3단 역 생성>");

		for(int i=9; i>0; i--) {
			System.out.println("3×" + i + " = " + 3*i);

		}

	}

}
