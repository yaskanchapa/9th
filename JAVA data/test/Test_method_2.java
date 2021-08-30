package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 한국 일본 중국 음식 받아 출력하기
// 맵과 리스트는 함수 사용하고 반환값 사용해 나중에 그걸로 출력하기
public class Test_method_2 {

	public static void main(String[] args) {

		Map<String,List<String>> mainCountryFoodMap = countryFood();
		for(String user:mainCountryFoodMap.keySet()){
		List<String> foodList = mainCountryFoodMap.get(user);
			for(String bg:foodList) {
				System.out.println(bg);
			}
		}
	}

	//함수 작성 : 기능-한국음식 리스트작성
	static List<String> koreaFood(){
		List<String> koreaFoodList = new ArrayList<String>();
		koreaFoodList.add("냉면");
		koreaFoodList.add("비빔밥");
		return koreaFoodList;
	}
	//함수 작성 : 기능-일본음식 리스트작성
	static List<String> japanFood(){
		List<String> japanFoodList = new ArrayList<String>();
		japanFoodList.add("라멘");
		japanFoodList.add("스시");
		return japanFoodList;
	}
	//함수 작성 : 기능-중국음식 리스트작성
	static List<String> chinaFood(){
		List<String> chinaFoodList = new ArrayList<String>();
		chinaFoodList.add("훠궈");
		chinaFoodList.add("꿔바로우");
		return chinaFoodList;
	}
	//함수 작성: 기능-각국 이름을 키값으로 맵작성
	static Map<String,List<String>> countryFood(){
		Map<String,List<String>> countryFoodMap = new HashMap<String,List<String>>();
		//함수값으 리스트를 여기로 가져와야함
		List<String> koreaFoodList = koreaFood();
		List<String> japanFoodList = japanFood();
		List<String> chinaFoodList = chinaFood();

		countryFoodMap.put("한국",koreaFoodList);
		countryFoodMap.put("일본",japanFoodList);
		countryFoodMap.put("중국",chinaFoodList);
		return countryFoodMap;
	}

}
