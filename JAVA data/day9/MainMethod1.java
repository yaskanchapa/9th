package day9;

import java.util.List;

public class MainMethod1 {

	public static void main(String[] args) {
		Method1 method1 = new Method1();

		List<String> unitNameList = method1.unitSearch("게이트웨이");
		if(unitNameList != null) {
			for(String unit : unitNameList) {
				System.out.println(unit);
			}
		}
		else{
			System.out.println("해당값이 없습니다.");
		}
	}

}
