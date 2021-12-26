package print;

import java.util.Scanner;

public class Print9 {
//	(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//	      4 7 2 (1)
//	    X 3 8 5 (2)
//	    -----------
//	    2 3 6 0 (3)
//	  3 7 7 6   (4)
//	1 4 1 6     (5)
//	---------------
//	1 8 1 7 2 0 (6)
//
//	첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//	첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();

		if(s1>0 && s1<1000 && s2>0 && s2<1000) {

			int a = s1*(s2 % 10);
			int b = s1*(s2 % 100 /10);
			int c = s1*(s2 / 100);

			System.out.println(a); //472*5
			System.out.println(b); //472*8
			System.out.println(c); //472*3
			System.out.println(a+10*b+100*c); //472*3

//			int A = sc.nextInt();
//			String B = sc.next();
//
//			sc.close();
//
//			System.out.println(A * (B.charAt(2) - '0'));
//			System.out.println(A * (B.charAt(1) - '0'));
//			System.out.println(A * (B.charAt(0) - '0'));
//			System.out.println(A * Integer.parseInt(B));

		}else {
		}

		sc.close();
	}
}
