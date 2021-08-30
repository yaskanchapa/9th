package day8;

import java.util.ArrayList;
import java.util.List;

public class Method_8_switch {

	public static void main(String[] args) {
		//파라메타, 반환값 존재
		//각나라별 음식 리스트중 원하는 나라의 음식리스트만 반환
		//한국:떡볶이,비빔밥,불고기
		//미국:햄버거,핫도그,스테이크
		//일본:스시,라면,규동
		//반환한 결과값은 메인메소드에 출력
		//메소드명:countryFoodList
		List<String> countryfoodList = countryFoodList("미국");
		if(countryfoodList != null) {
			for(String food : countryfoodList) {
				System.out.println(food);
			}
		}
		else{
			System.out.println("해당값이 없습니다.");
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
	static List<String> countryFoodList(String countryname) {
		switch(countryname) {
		case "한국" :
			return koreaFood();
		case "미국" :
			return americaFood();
		case "일본" :
			return japanFood();
		default:
			return null;
		}
	}
}
