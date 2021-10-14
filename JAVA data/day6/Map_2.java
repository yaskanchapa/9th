package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_2 {

	public static void main(String[] args) {
//	1반 2반 3반 에 각각 3명씩 넣기
//	맵을 통해 해놓는게 편한 이유 : 분류해놓고 라벨을 붙여 놓기 때문에 관리가 편함.

//		맵 선언
		Map<String,List<String>> classNameMap = new HashMap<String,List<String>>();

//		리스트 선언 리스트 값 넣기
		List<String> class1NameList = new ArrayList<String>();
		class1NameList.add("김일반");
		class1NameList.add("이일반");
		class1NameList.add("최일반");
		List<String> class2NameList = new ArrayList<String>();
		class2NameList.add("김이반");
		class2NameList.add("이이반");
		class2NameList.add("최이반");
		List<String> class3NameList = new ArrayList<String>();
		class3NameList.add("김삼반");
		class3NameList.add("이삼반");
		class3NameList.add("최삼반");

//		이 결과 각 리스트에 이하와 같이 값이 들어가 있을 것임
//		값(리스트)
//		class1NameList - 1반 리스트 3명
//		class2NameList - 2반 리스트 3명
//		class3NameList - 3반 리스트 3명

//		맵 에다 값 넣기
		classNameMap.put("1반", class1NameList);
		classNameMap.put("2반", class2NameList);
		classNameMap.put("3반", class3NameList);

//		이 결과 이하와 같이 값이 들어가 있을 것임
//		키값  값(리스트)
//		1반 - 1반 리스트 3명
//		2반 - 2반 리스트 3명
//		3반 - 3반 리스트 3명

//		지금 까지의 처리 요약:
//		리스트를 통해 각 반에 인원이름 넣어놓고
//		맵을 통해서 각 리스트에 라벨(키값)을 붙여둔 것

//		맵 안에 리스트가 들어있을 시 이중 확장 for문으로 출력을 잡아 줘야됨
		for(String className : classNameMap.keySet()) {
//			className 에 키 값이 들어 갈 거임 1반 ,2반, 3반
			for(String name: classNameMap.get(className)) {
//				get으로 각 반키값(리스트값)을 출력해서 name이란 변수에 넣는다.
				System.out.println(className + ":" + name);
//				className 에 1반 들어오면 name에 1반에 인원 하나씩 반복해 출력
				

			}
		}
	}

}
