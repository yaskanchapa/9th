package for_1;

import java.util.Scanner;

public class For_3 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int rs = 0;

		if(1<=n && n<=10000) {

			for(int i=1; i<=n; i++) {
				rs += i;
			}
			System.out.println(rs);
		}
		sc.close();

	}
}
