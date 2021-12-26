package if1;

import java.util.Scanner;

public class If1_5 {
//	알람 45분 일찍 맞추기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int H = sc.nextInt();
		int M = sc.nextInt();

		if(0<=H && H<=23 && 0<=M && M<=59) {

			if(M<45) {
				H -= 1;
				M += 60;
			}
			if(H<0) {
				H += 24;
			}
			System.out.println(""+H+" "+(M-45)); // 결과 9 25
//			System.out.println(H+(M-45));   // 결과 34
		}
		sc.close();
	}
}
