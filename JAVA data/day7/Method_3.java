package day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method_3 {

	public static void main(String[] args) {
		Map<String,List<String>> starNameMap = starcraft();

		for(String starName : starNameMap.keySet()) {
		List<String> unitList = starNameMap.get(starName);
			for(String unit : unitList) {
				System.out.println(unit);
			}
		}

	}

	static List<String> terranunitList() {

		List<String> terranUnitList = new ArrayList<String>();
		terranUnitList.add("마린");
		terranUnitList.add("매딕");
		terranUnitList.add("고스트");

		return terranUnitList;

	}
	static List<String> zergunitList() {

		List<String> zergunitList = new ArrayList<String>();
		zergunitList.add("저글링");
		zergunitList.add("히드라");
		zergunitList.add("뮤탈");

		return zergunitList;

	}
	static List<String> protosunitList() {

		List<String> protosunitList = new ArrayList<String>();
		protosunitList.add("질럿");
		protosunitList.add("드라군");
		protosunitList.add("케리어");

		return protosunitList;

	}

	//변수 없고 반환값 존재
	//스타크래프트 각 종족별 유닛 리스트를 생성해서 반환
	//맵선언

	static Map<String, List<String>> starcraft() {
		Map<String, List<String>> unitNameMap = new HashMap<String, List<String>>();
		//리스트 선언
		List<String> terranUnitList = terranunitList();
		//리스트 선언
		List<String> zergUnitList = zergunitList();
		//리스트 선언
		List<String> protosUnitList = protosunitList();

		//맵에 리스트 매칭시키기
		unitNameMap.put("테란",terranUnitList);
		unitNameMap.put("저그",zergUnitList);
		unitNameMap.put("프로토스",protosUnitList);

		return unitNameMap;


	}


}
