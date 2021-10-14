package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method1 {

	Map<String, List<ClassBean>> 클래스맵함수(){
		List<ClassBean> 일반리스트 = new ArrayList<ClassBean>();

		ClassBean classBean1 = new ClassBean();

		classBean1.setName("김일일");
		classBean1.setHeight(181);
		classBean1.setWeight(81);
		classBean1.setBloodType("A형");
		classBean1.setStudentNum(101);

		ClassBean classBean2 = new ClassBean();

		classBean2.setName("김일이");
		classBean2.setHeight(182);
		classBean2.setWeight(82);
		classBean2.setBloodType("AB형");
		classBean2.setStudentNum(102);

		일반리스트.add(classBean1);
		일반리스트.add(classBean2);

		List<ClassBean> 이반리스트 = new ArrayList<ClassBean>();
		ClassBean classBean3 = new ClassBean();

		classBean3.setName("김이일");
		classBean3.setHeight(171);
		classBean3.setWeight(71);
		classBean3.setBloodType("AB형");
		classBean3.setStudentNum(201);

		ClassBean classBean4 = new ClassBean();

		classBean4.setName("김이이");
		classBean4.setHeight(172);
		classBean4.setWeight(72);
		classBean4.setBloodType("B형");
		classBean4.setStudentNum(202);

		이반리스트.add(classBean3);
		이반리스트.add(classBean4);

		List<ClassBean> 삼반리스트 = new ArrayList<ClassBean>();
		ClassBean classBean5 = new ClassBean();

		classBean5.setName("김삼일");
		classBean5.setHeight(191);
		classBean5.setWeight(91);
		classBean5.setBloodType("O형");
		classBean5.setStudentNum(301);

		ClassBean classBean6 = new ClassBean();

		classBean6.setName("김삼이");
		classBean6.setHeight(183);
		classBean6.setWeight(85);
		classBean6.setBloodType("A형");
		classBean6.setStudentNum(302);

		삼반리스트.add(classBean5);
		삼반리스트.add(classBean6);

		Map<String,List<ClassBean>> 학생맵 = new HashMap<String,List<ClassBean>>();
		학생맵.put("1반", 일반리스트);
		학생맵.put("2반", 이반리스트);
		학생맵.put("3반", 삼반리스트);

		return 학생맵;
	}
	String 출력함수() {
		Map<String,List<ClassBean>> 클래스맵 = 클래스맵함수();
		if(클래스맵 != null) {
		for(String 키값 : 클래스맵.keySet()) {
			List<ClassBean> 반리스트 = 클래스맵.get(키값);
			System.out.println("<<"+ 키값 + "정보입니다.>>");
			for(ClassBean 이름빈 : 반리스트) {
				System.out.println(이름빈.getName());
				System.out.println(이름빈.getHeight());
				System.out.println(이름빈.getWeight());
				System.out.println(이름빈.getBloodType());
				System.out.println(이름빈.getStudentNum());
			}
		}
		}else{
			System.out.println("값이 잘못되었습니다.");
		}
		return null;
	}


}
