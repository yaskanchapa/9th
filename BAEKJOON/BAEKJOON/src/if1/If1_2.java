package if1;

import java.util.Scanner;

public class If1_2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int Testnum = sc.nextInt();

	if(0<=Testnum && Testnum<=100) {
		if(90<=Testnum && Testnum<=100) {
			System.out.println("A");
		}else if(80<=Testnum && Testnum<=89) {
			System.out.println("B");

		}else if(70<=Testnum && Testnum<=79) {
			System.out.println("C");

		}else if(60<=Testnum && Testnum<=69) {
			System.out.println("D");

		}else {
			System.out.println("F");

		}
	}else {
	}
	sc.close();
	}
}
