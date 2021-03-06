package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method2 {
// 스타 유닛 맵
// 파라메터 종족값 넣어서 해당 종족 맵을 반환
// 반환한 맵 값은 메인 메소드에서 반복문 통해 출력

//	테란: 키값 :배럭 value:마린,매딕,고스트
//	저그: 키값 :해처리 value:저글링, 히드라, 뮤탈
//	프로토스: 키값 :게이트웨이 value:질럿, 드라군, 템플러

	List<String> 배럭리스트함수() {

		List<String> 배럭리스트 = new ArrayList<String>();
		배럭리스트.add("마린");
		배럭리스트.add("매딕");
		배럭리스트.add("고스트");

		return 배럭리스트;

	}
	List<String> 해처리리스트함수() {

		List<String> 해처리리스트 = new ArrayList<String>();
		해처리리스트.add("저글링");
		해처리리스트.add("히드라");
		해처리리스트.add("뮤탈");

		return 해처리리스트;

	}
	List<String> 게이트웨이리스트함수() {

		List<String> 게이트웨이리스트 = new ArrayList<String>();
		게이트웨이리스트.add("질럿");
		게이트웨이리스트.add("드라군");
		게이트웨이리스트.add("다크템플러");

		return 게이트웨이리스트;

	}

	Map<String, List<String>> 스타크래프트맵함수(String 종족명) {
		switch(종족명) {
		case"테란":
			Map<String, List<String>> 테란맵 = new HashMap<String, List<String>>();
			테란맵.put("배럭",배럭리스트함수());
			return 테란맵;
		case"저그":
			Map<String, List<String>> 저그맵 = new HashMap<String, List<String>>();
			저그맵.put("해처리",배럭리스트함수());
			return 저그맵;
		case"프로토스":
			Map<String, List<String>> 프로토스맵 = new HashMap<String, List<String>>();
			프로토스맵.put("게이트웨이",배럭리스트함수());
			return 프로토스맵;
		default:
			return null;
		}
	}

}
