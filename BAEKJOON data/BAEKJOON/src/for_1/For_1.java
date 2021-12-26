package for_1;

import java.util.Scanner;

public class For_1 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int rs;

		for(int i=1; i<10; i++) {
			rs = num1*i;
			System.out.println(num1+" * "+i+" = "+rs);
		}
		sc.close();

	}
}
