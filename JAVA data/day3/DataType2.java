package day3;

public class DataType2 {

	public static void main(String[] args) {

		System.out.println("Hello" + "World");
		System.out.println(100 + 200);
		System.out.println("Hello" + 200);
		// 이경우는 Hello100200
		System.out.println("Hello" + 100 + 200);
		// 이경우는 300Hello
		System.out.println(200 + 100 + "Hello");

		int num1 = 100;
		int num2 = 200;

		System.out.println(num1 + num2);
		System.out.println("num1" + "num2");

		/*
		사칙연산
		나머지 : %
		*/

		System.out.println(4%3);
	}

}
