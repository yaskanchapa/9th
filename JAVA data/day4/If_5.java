package day4;

public class If_5 {

	public static void main(String[] args) {
		int num = 15;

		/*
		 삼항 연산자
		num > 10의 조건을 본다. = ?의미
		맞으면 20 아니면 10 이란 의미
		*/
		num = (num > 10)?20:10;

		System.out.println(num);

		// num = (num > 10)?20:10;과 같은 의미
		if(num > 10) {
			num = 20;
		}else {
			num = 10;
		}
		System.out.println(num);
	}

}
