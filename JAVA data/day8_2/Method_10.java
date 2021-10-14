package day8_2;

import java.util.List;

import day8.Method_8_1;

public class Method_10 {

	public static void main(String[] args) {
		// 8_1의 접근제어자 확인 할 것
		Method_8_1 method_8_1= new Method_8_1();

		List<String> countryfoodList = method_8_1.countryFoodList("미국");
		if(countryfoodList != null) {
			for(String food : countryfoodList) {
				System.out.println(food);
			}
		}
		else{
			System.out.println("해당값이 없습	니다.");
		}

	}

}
