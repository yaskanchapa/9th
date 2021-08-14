package day3;

public class Loop4 {

	public static void main(String[] args) {

		int num = 1;

		//num = num + 5;
		num += 5;
		// =+랑 의미 다름 주의! =+는 중첩안됨 +5를 넣는다는 의미가 되버림

		System.out.println(num);

		String text = "Hello";

		text = text + "world";

		System.out.println(text);
		System.out.println("------------------");

		//1부터 10까지 합 while버전
		System.out.println("1부터 10까지 합 while버전");
		int num1 = 1;
		int sum1 = 0;

		while(num1 < 11) {
			sum1 = sum1 + num1;
			// 똑같은 의미 sum1 += num1;
			num1++;
		}
		System.out.println(sum1);

		//1부터 10까지 합 for버전
		System.out.println("1부터 10까지 합 for버전");
		int sum2 = 0;

		for (int i = 1; i < 11; i++ ) {
			// sum2 = i + sum2;
			sum2 += i;
		}
		System.out.println(sum2);
	}

}
