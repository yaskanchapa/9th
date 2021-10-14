package day4;

public class Break_1 {

	public static void main(String[] args) {

		System.out.println("컨티뉴 구문입니다.");
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("브레이크 구문입니다.");
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

}
