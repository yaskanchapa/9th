package day5;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

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
	}

}
