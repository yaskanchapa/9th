package while_1;

import java.util.Scanner;

public class While_2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			//hasNextInt()에선 빈값은 fale 를 출력함
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}
