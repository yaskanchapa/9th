package day4;

public class Switch_1 {

	public static void main(String[] args) {

		String season = "summer";

		//변수season이랑 case랑 비교해서 맞으면 출력 break 안잊도록 :란 것도 주의
		//default가 else같은 의미 예외를 다 처리하는 구문 이경우 break안쓰는거 주의
		//case에는 범위지정이 안된다. 즉 부등호로 조건문만들땐 if문 사용
		//스위치의 경우 만족해도 밑으로 계속 읽고 실행하기에 브레이크를 걸어줘야 함.
		//혹시 return이 사용된다면 거기서 종료 시키기 떄문에 break 사용 할 필요 없다.
		switch(season) {
			case "spring" :
				System.out.println("봄입니다.");
				break;
			case "summer" :
				System.out.println("여름입니다.");
				break;
			case "fall" :
				System.out.println("가을입니다.");
				break;
			case "winter" :
				System.out.println("겨울입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
	}

}
