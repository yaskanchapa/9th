package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_3 {

	public static void main(String[] args) {

//		맵선언
		Map<String,List<String>> countryFoodMap = new HashMap<String,List<String>>();

//		리스트 선언 리스트 값 넣기
		List<String> koreaFoodList = new ArrayList<String>();
		koreaFoodList.add("비빔밥");
		koreaFoodList.add("삼겹살");
		koreaFoodList.add("떡볶이");
		List<String> chianaFoodList = new ArrayList<String>();
		chianaFoodList.add("마파두부");
		chianaFoodList.add("훠궈");
		chianaFoodList.add("꿔바로우");
		List<String> japanFoodList = new ArrayList<String>();
		japanFoodList.add("스시");
		japanFoodList.add("라멘");
		japanFoodList.add("돈카츠");

//		각 리스트에 키값 지정하기 = 맵에 넣기 = 라벨 붙이기
		countryFoodMap.put("한국", koreaFoodList);
		countryFoodMap.put("중국", chianaFoodList);
		countryFoodMap.put("일본", japanFoodList);

		for(String countyName : countryFoodMap.keySet()) {
//			countyName 에 키 값이 들어 갈 거임 한국 ,중국, 일본
			for(String food: countryFoodMap.get(countyName)) {
//				get으로 각 반키값(리스트값)을 출력해서 name이란 변수에 넣는다.
//				한국 음식 중국음식 일본음식이 각각 food에 들어갈거임
				System.out.println(countyName + ":" + food);
//				className 에 1반 들어오면 name에 1반에 인원 하나씩 반복해 출력
			}
		}

//		좀 더 알아보기 쉬운 코드
//		맵의 포문 출력은 for(변수:맵키셋팅)
		for(String countryName : countryFoodMap.keySet()) {
//			countyName 에 키 값이 들어 갈 거임 한국 ,중국, 일본
			List<String> foodNameList = countryFoodMap.get(countryName);
//			foodNameList에다가 넣을 거야 뭘? countryFoodMap에서 get으로 키값의 해당값(리스트값)꺼내옴
//			즉 foodNameList란 리스트에 각 나라의 음식(리스트)를 넣어둠
//			for(변수:리스트)니까 다음과 같이 입력
			for(String food: foodNameList) {
//				한국 음식 중국음식 일본음식이 각각 food에 들어갈거임
				System.out.println(countryName + ":" + food);
//				className 에 1반 들어오면 name에 1반에 인원 하나씩 반복해 출력
			}
		}
	}

}
