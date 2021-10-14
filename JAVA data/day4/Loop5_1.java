package day4;

public class Loop5_1 {

	//메소드 밖의 변 수 는 사용이 안됨
	String name = "김태환";

	//메소드 = 함수 = 펑션 : 처리되는 부분
	public static void main(String[] args) {

		String name = "김태환";
		//위에 변수 지정이 없다면 메소드 밖 변수라서 사용 못함
		System.out.println(name);

	}

}
