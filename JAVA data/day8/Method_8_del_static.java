package day8;

import java.util.ArrayList;
import java.util.List;

public class Method_8_del_static {

	public static void main(String[] args) {
		Method_8_del_static method8 = new Method_8_del_static();

		List<String> countryfoodList = method8.countryFoodList("미국");
		if(countryfoodList != null) {
			for(String food : countryfoodList) {
				System.out.println(food);
			}
		}
		else{
			System.out.println("해당값이 없습니다.");
		}
	}

	List<String> koreaFood(){
		List<String> koreaFoodList = new ArrayList<String>();
		koreaFoodList.add("떡볶이");
		koreaFoodList.add("비빔밥");
		koreaFoodList.add("불고기");
		return koreaFoodList;
	}
	List<String> americaFood(){
		List<String> americaFoodList = new ArrayList<String>();
		americaFoodList.add("햄버거");
		americaFoodList.add("핫도그");
		americaFoodList.add("스테이크");
		return americaFoodList;
	}
	List<String> japanFood(){
		List<String> japanFoodList = new ArrayList<String>();
		japanFoodList.add("스시");
		japanFoodList.add("라면");
		japanFoodList.add("규동");
		return japanFoodList;
	}
	List<String> countryFoodList(String countryname) {
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
