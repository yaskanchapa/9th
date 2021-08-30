package day8;

import java.util.List;

public class Method_9 {

	public static void main(String[] args) {

		Method_8_1 method_8_1 = new Method_8_1();

		List<String> countryfoodList = method_8_1.countryFoodList("미국");
		if(countryfoodList != null) {
			for(String food : countryfoodList) {
				System.out.println(food);
			}
		}
		else{
			System.out.println("해당값이 없습니다.");
		}

	}

}
