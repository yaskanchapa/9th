package day5;

public class Array_1 {

	public static void main(String[] args) {

		//여러가지 이름 값 설정

		//방법1. 고길동둘리 란 이름이 된 것 뿐
		String name = "고길동";
		name = name + "둘리";

		//방법2. DataType[]객체명 = {값,값,값};
		//배열은 일반적으로 선언해둔 후 나중에 값을 담는 방식으로 처리하는경우가 많음
		String[]nameArray = {"고길동","둘리","또치"};

		System.out.println(name);

		//배열은 인덱스를 갖고 있기 대문에 0부터 카운트됨
		System.out.println(nameArray[2]);

		//배열 다보고 싶으면 반복문 사용해 보면됨
		for(int i = 0; i<3; i++) {
			System.out.println(nameArray[i]);
		}


	}

}
