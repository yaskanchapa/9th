package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 스타 유닛 출력하기
public class Test_method_1 {

	public static void main(String[] args) {
		Map<String,List<String>> starNameMap = unitMap();
		for(String keyname:starNameMap.keySet()) {
		List<String> nameList = starNameMap.get(keyname);
			for(String name:nameList) {
				System.out.println(name);
			}
		}

	}
//	메소드3개 생성: 스타 유닛 리스트 관리 테란 저그 프로토스
	static List<String> terranUnit(){
		List<String> terranUnitList = new ArrayList<String>();
		terranUnitList.add("마린");
		terranUnitList.add("메딕");
		terranUnitList.add("고스트");
		return terranUnitList;
	}
	static List<String> zergUnit(){
		List<String> zergUnitList = new ArrayList<String>();
		zergUnitList.add("저글링");
		zergUnitList.add("히드라");
		zergUnitList.add("뮤탈");
		return zergUnitList;
	}
	static List<String> protosUnit(){
		List<String> protosUnitList = new ArrayList<String>();
		protosUnitList.add("질럿");
		protosUnitList.add("다크템플러");
		protosUnitList.add("드라군");
		return protosUnitList;
	}

//	메소드2: 스타 종족 맵 관리 (리스트와 종족 매칭 시킬 예정)
	static Map<String,List<String>> unitMap(){
		Map<String,List<String>> unitMap = new HashMap<String,List<String>>();
		List<String> terranUnitList = terranUnit();
		List<String> zergUnitList = zergUnit();
		List<String> protosUnitList = protosUnit();
		unitMap.put("테란",terranUnitList);
		unitMap.put("저그",zergUnitList);
		unitMap.put("프로토스",protosUnitList);
		return unitMap;
	}
}
