package if1;

import java.util.Scanner;

public class If1_1 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int A = sc.nextInt();
	int B = sc.nextInt();

	if(-10000<=A && A<=10000 && -10000<=A && B<=10000) {
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else if(A==B) {
			System.out.println("==");
		}
	}
	sc.close();
	}

}
