package day4;

public class Switch_2 {

	public static void main(String[] args) {
		//혈액형 판별만들기

		String bloodType = "B";

		switch(bloodType) {
		case "A" :
			System.out.println(bloodType+"형입니다.");
			break;
		case "B" :
			System.out.println(bloodType+"형입니다.");
			break;
		case "AB" :
			System.out.println(bloodType+"형입니다.");
			break;
		case "O" :
			System.out.println(bloodType+"형입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
	}

	}

}
