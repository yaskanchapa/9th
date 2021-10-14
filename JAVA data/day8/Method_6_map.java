package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method_6_map {

	public static void main(String[] args) {
		//파라메타, 반환값 존재
		//각나라별 음식 리스트중 원하는 나라의 음식리스트만 반환
		//한국:떡볶이,비빔밥,불고기
		//미국:햄버거,핫도그,스테이크
		//일본:스시,라면,규동
		//반환한 결과값은 메인메소드에 출력
		//메소드명:countryFoodList
		Map<String,List<String>> countryfoodMap = countryFood();

		for(String countryfoodname : countryfoodMap.keySet()) {
			System.out.println("<<" + countryfoodname + ">>");
			List<String> foodList = countryfoodMap.get(countryfoodname);
			for(String food : foodList) {
				System.out.println(food);
			}
		}
	}

	static List<String> countryFoodList(String countryName){
		if("한국".equals(countryName)) {
			return null;
		}else if("미국".equals(countryName)) {
			return null;
		}else if("일본".equals(countryName)) {
			return null;
		}else {
			return null;
		}
	}


	static List<String> koreaFood(){
		List<String> koreaFoodList = new ArrayList<String>();
		koreaFoodList.add("떡볶이");
		koreaFoodList.add("비빔밥");
		koreaFoodList.add("불고기");
		return koreaFoodList;
	}
	static List<String> americaFood(){
		List<String> americaFoodList = new ArrayList<String>();
		americaFoodList.add("햄버거");
		americaFoodList.add("핫도그");
		americaFoodList.add("스테이크");
		return americaFoodList;
	}
	static List<String> japanFood(){
		List<String> japanFoodList = new ArrayList<String>();
		japanFoodList.add("스시");
		japanFoodList.add("라면");
		japanFoodList.add("규동");
		return japanFoodList;
	}

	static Map<String,List<String>> countryFood(){
		Map<String,List<String>> countryFoodMap = new HashMap<String,List<String>>();
		List<String>koreaFoodList = koreaFood();
		List<String>americaFoodList = americaFood();
		List<String>japanFoodList = japanFood();

		countryFoodMap.put("한국",koreaFoodList);
		countryFoodMap.put("미국",americaFoodList);
		countryFoodMap.put("일본",japanFoodList);

		return countryFoodMap;
	}
}
