package day5;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
//		리스트의 경우 내포된게 아니기에 import 작업이 필요하다.
//		List<String>객체명 = new ArrayList<String>();
//		new뒤에는 사용할 리스트를 씀
//		int는 또 다른 형태임
//		[]가 아닌 ()를 사용한단 것에 주의


//		배열과 리스트의 차이
//		String[] nameArray = new String[4];
//		List<String>객체명 = new ArrayList<String>();

		List<String> nameList = new ArrayList<String>();

//		0번째 인덱스 값에 고길동이 들어감
		nameList.add("고길동");
		nameList.add("둘리");
		nameList.add("도우너");
		nameList.add("마이클");
		nameList.add("또치");

//		출력 할 때는 인덱스 값으로 출력한다.
		nameList.get(0);

		for(int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

//		확장for문
//		for(List와 같은 데이터타입 변수 : List객체명) {
//			syso(List와 같은 데이터타입의 변수);
//		}
		System.out.println("확장for문 출력");
		for(String name:nameList){
			System.out.println(name);
		}

//		이것은 단순히 리스트 확인용
		System.out.println(nameList);

		List<String> addressList = new ArrayList<String>();
		addressList.add("신주쿠");
		addressList.add("시부야");
		addressList.add("시나가와");
		addressList.add("오다이바");

		System.out.println("확장for문 출력");
		for(String address:addressList){
			System.out.println(address);
		}
	}

}
