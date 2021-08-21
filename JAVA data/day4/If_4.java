package day4;

public class If_4 {

	public static void main(String[] args) {

		String name = "김태환";
		int age = 33;
		boolean isHuman = true;

		//중복 조건 && and
		if("김태환".equals(name) && age == 33 && isHuman) {
			System.out.println("전부 일치합니다.");
		}
		// 중복 조건 || or
		if("김태환".equals(name) || age == 33 || isHuman) {
			System.out.println("전부다 일치는 아닙니다.");
		}

		// 최소 공배수
		// 1에서 50까지 출력하는 for문을 생성
		// 그중 2의배수이면서 3의배수인 수만 출력
		for(int i = 0; i < 51; i++) {
			if(i%2 == 0 && i%3 == 0) {
				System.out.println(i+"는 2와 3의 공배수입니다.");
			}
		}

		//계절 구분하기 버전2
		String season = "summer";

		if("spring".equals(season)||"summer".equals(season)||"fall".equals(season)||"winter".equals(season)) {
			System.out.println(season+"입니다.");
		}else {
			System.out.println("잘못된 오류입니다.");
		}



	/*메인 메소드 끝*/}

}
