package day4;

// 예약어 니까 _1 붙여 논다.
public class If_1 {

	public static void main(String[] args) {

		String name = "김태환";

		name = "김정화";
		// && 둘다 참일경우 and의미
		if(name == "김태환") {
			System.out.println("33살입니다.");
		}
		else if(name == "김정화") {
			System.out.println("37살입니다.");
		}
		else {
			System.out.println("모릅니다.");
		}

	}

}
