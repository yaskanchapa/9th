package day4;

public class If_3 {

	public static void main(String[] args) {

		String season = "winter";

		//조건문 생성 season에 들어오는 조건에 따라 "봄입니다","여름입니다."...등 생성

		if("spring".equals(season)) {
			System.out.println("봄입니다.");
		}else if("summer".equals(season)) {
			System.out.println("여름입니다.");
		}else if("fall".equals(season)) {
			System.out.println("가을입니다.");
		}else if("winter".equals(season)) {
			System.out.println("겨울입니다.");
		}else {
			System.out.println("잘못된 오류입니다.");
		}

		// 테스트 점수에 따른 등급 메기기
		int TestResult = 73;

		// else if 사용했을 때
		if(TestResult >= 90) {
			System.out.println("A학점입니다.");
		}
		else if(TestResult >= 80) {
			System.out.println("B학점입니다.");
		}
		else if(TestResult >= 70) {
			System.out.println("C학점입니다.");
		}
		else if(TestResult >= 60) {
			System.out.println("D학점입니다.");
		}
		else if(TestResult >= 50) {
			System.out.println("E학점입니다.");
		}
		else{
			System.out.println("F학점입니다.");
		}

		//if로 작성했을 때
		if(TestResult >= 90) {
			System.out.println("A학점입니다.");
		}
		if(90 >TestResult && TestResult >= 80) {
			System.out.println("B학점입니다.");
		}
		if(80 >TestResult && TestResult >= 70) {
			System.out.println("C학점입니다.");
		}
		if(70 >TestResult && TestResult >= 60) {
			System.out.println("D학점입니다.");
		}
		if(60 >TestResult && TestResult >= 50) {
			System.out.println("E학점입니다.");
		}
		else if(50 >TestResult){
			System.out.println("F학점입니다.");
		}


	}
}
