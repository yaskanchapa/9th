package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_map {

	public static void main(String[] args) {
//		문제1 유치원명단출력
//		장미반:시온,이서,시우
//		해바라기반:영우,영철,진호

//		맵 선언
		Map<String,List<String>> classNameMap = new HashMap<String,List<String>>();
//		리스트 선언
		List<String> class1List = new ArrayList<String>();
//		리스트 값넣기
		class1List.add("시온");
		class1List.add("이서");
		class1List.add("시우");
//		class1List = [시온, 이서, 시우]

//		리스트 선언
		List<String> class2List = new ArrayList<String>();
//		리스트 값넣기
		class2List.add("영우");
		class2List.add("영철");
		class2List.add("진호");
//		class2List = [영우, 영철, 진호]

//		맵 (리스트에 라벨 붙이기)
		classNameMap.put("장미반", class1List);
		classNameMap.put("해바라기반", class2List);

//		출력
		for(String classname : classNameMap.keySet()) {
			//장미반이 처음에 classname에 들어갈거고
			List<String> userList = classNameMap.get(classname);
			// 맵.get(장미반)으로 키값 장미반에 값이 userList에 들어감
			for(String username : userList) {
			// userList의 값 하나하나를 username에 넣을거야
				System.out.println(classname + "명단:" + username);
			// 현재 처음 상태라면 classname 엔 장미반이 들어가있는 상태고
//				userList에는 키값 장미반에 해당하는 장미반 인원이 들어가있고
//				username에는 장미반 인원 1첫번째 인원이 들어가있다
			}
		}









	}

}
