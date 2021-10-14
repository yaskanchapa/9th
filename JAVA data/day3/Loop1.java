package day3;

public class Loop1 {

	public static void main(String[] args) {

		/*
		 반복문 기본구조
		for(조건) {
			처리내용:조건이 참이면 실행 거짓이면 종료됨.
		}
		*/

		// 2중이상 반복문의 경우는 i j k l 등으로 변수설정 해가면됨
		// 부등호도 작거나 같다란 경우는 반복문에서는 잘 사용하지는 않다. <=,>=
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println(i + "and" + j);
			}
			System.out.println("HelloWorld" + i);
		}

		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}

	}

}
