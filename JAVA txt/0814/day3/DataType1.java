package day3;

public class DataType1 {

	public static void main(String[] args) {

		/*
		 변수
		 예약어 사용안됨
		 알기 쉽게 할 것
		 */

		//글자타입 대문자 시작한단 걸 조심
		String name = "김태환";

		//캐멀케이스
		String FirstName;

		//스네이크케이스
		String first_name;

		//정수타입
		int age = 33;

		/*
		 참 거짓 boolean -는 -다 라신식으로 이름짓기
		true, false
		*/
		boolean isHuman = true;

		//소수점
		float num = 1.3f;


		System.out.println("이름:" + name + "\n" + "나이:" + age);
		System.out.println(isHuman);
		System.out.println(num);

	}

}
