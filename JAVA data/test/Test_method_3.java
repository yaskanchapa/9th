package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//유치원 반과 명단 짜기
public class Test_method_3 {

	public static void main(String[] args) {
		System.out.println("className()의 값은 맵형태이고" + className());
		System.out.println("jangmiName()의 값은 리스트형태이고" + jangmiName());
		System.out.println("hebaragiName()의 값은 리스트형태이고" + hebaragiName());
		System.out.println("-------------for문으로 출력 합니다---------------");

		Map<String,List<String>> classNameMap = className();
		for(String classname:classNameMap.keySet()) {
			System.out.println(classname + "명단");
			List<String> classNameList = classNameMap.get(classname);
			for(String username:classNameList) {
				System.out.println(username);
			}
		}
	}

	// 장미반 리스트 생성 메소드
	static List<String> jangmiName() {
		List<String> jangminameList = new ArrayList<String>();
		jangminameList.add("철수");
		jangminameList.add("영희");
		jangminameList.add("준구");
		return jangminameList;
	}
	// 해바라기반 리스트 생성 메소드
	static List<String> hebaragiName() {
		List<String> hebaraginameList = new ArrayList<String>();
		hebaraginameList.add("철수");
		hebaraginameList.add("영희");
		hebaraginameList.add("준구");
		return hebaraginameList;

	}
	//맵생성 메소드 생성
	//키값: 반이름
	//키값의value값:해당반 원생이름담긴 리스트
	static Map<String,List<String>> className(){
		Map<String,List<String>> classNameMap = new HashMap<String,List<String>>();
		List<String> jangmiNameList = jangmiName();
		List<String> hebaragiNameList = hebaragiName();

		classNameMap.put("장미반", jangmiNameList);
		classNameMap.put("해바라기반", hebaragiNameList);

		return classNameMap;
	}

}
