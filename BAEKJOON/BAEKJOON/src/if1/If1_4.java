package if1;

import java.util.Scanner;

public class If1_4 {
//	사분면 고르기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int x = sc.nextInt();
		int y = sc.nextInt();

		if(-1000<=x && x<=1000 && x!=0 && -1000<=y && y<=1000 && y!=0) {
			if(0<x && 0<y) {
				System.out.println("1");

			}else if(0>x && 0<y) {
				System.out.println("2");

			}else if(0>x && 0>y) {
				System.out.println("3");

			}else if(0<x && 0>y) {
				System.out.println("4");
			}
		}
		sc.close();
	}
}
