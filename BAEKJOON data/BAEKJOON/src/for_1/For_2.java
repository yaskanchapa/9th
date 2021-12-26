package for_1;

import java.util.Scanner;

public class For_2 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int rs = 0;

		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if(0<A+B && A+B<20) {
				rs= A+B;
				System.out.println(rs);
			}

		}
		sc.close();

	}
}
