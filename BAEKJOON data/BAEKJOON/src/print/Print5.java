package print;

import java.util.Scanner;

public class Print5 {
//	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(0<a && b<10) {
			System.out.println(a+b);
		}else {
		}

		sc.close();
	}
}
