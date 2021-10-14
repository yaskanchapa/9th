package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method1 {
// 스타 유닛 맵
// 파라메터 종족값 넣어서 해당 종족 맵을 반환
// 반환한 맵 값은 메인 메소드에서 반복문 통해 출력

//	테란: 키값 :배럭 value:마린

	List<String> berukUnitList() {

		List<String> berukunitList = new ArrayList<String>();
		berukunitList.add("마린");
		berukunitList.add("매딕");
		berukunitList.add("고스트");

		return berukunitList;

	}
	List<String> hechuriUnitList() {

		List<String> hechuriunitList = new ArrayList<String>();
		hechuriunitList.add("저글링");
		hechuriunitList.add("히드라");
		hechuriunitList.add("뮤탈");

		return hechuriunitList;

	}
	List<String> gatewayUnitList() {

		List<String> gatewayUnitList = new ArrayList<String>();
		gatewayUnitList.add("질럿");
		gatewayUnitList.add("드라군");
		gatewayUnitList.add("다크템플러");

		return gatewayUnitList;

	}

	Map<String, List<String>> starcraft() {
		Map<String, List<String>> unitNameMap = new HashMap<String, List<String>>();
		//리스트 선언
		List<String> berukunitList = berukUnitList();
		List<String> hecuriunitList = hechuriUnitList();
		List<String> gatewayUnitList = gatewayUnitList();

		//맵에 리스트 매칭시키기
		unitNameMap.put("배럭",berukunitList);
		unitNameMap.put("해처리",hecuriunitList);
		unitNameMap.put("게이트웨이",gatewayUnitList);

		return unitNameMap;
	}

//	판단메소드
	List<String> unitSearch(String unitname) {
		switch(unitname) {
		case "배럭" :
			return berukUnitList();
		case "해처리" :
			return hechuriUnitList();
		case "게이트웨이" :
			return gatewayUnitList();
		default:
			return null;
		}
	}

}
