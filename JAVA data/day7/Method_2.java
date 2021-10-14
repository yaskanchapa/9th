package day7;

public class Method_2 {

	public static void main(String[] args) {
		printNumberSum(2,3);
		printSendMail("김태환");
		구구단(7);
	}

	static void printNumberSum(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println("결과값은" + sum + "입니다.");
		// 인수값 존재, 리턴 값없음 void란 의미
		// 문자를 받아오면 문자 + "에게 메일을 보냅니다."란 메세지 출려
	}

	static void printSendMail(String name) {
		System.out.println(name + "에게 메일을 보냅니다.");
	}

	// 입력한 숫자의 구구단을 출력
	static void 구구단(int num) {
		System.out.println(num + "단을 출력합니다.");
		for(int i = 1; i <10; i++) {
			System.out.println(num + "×" + i + "=" + (num*i));
		}
	}

//끝 줄 입니다.
}
