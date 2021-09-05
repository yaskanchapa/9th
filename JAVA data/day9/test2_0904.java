package day9;

import java.util.List;

public class test2_0904 {

	public static void main(String[] args) {
	List<String> 입력된종족리스트 = 종족입력함수("테란");

	}

	static List<String> 종족입력함수(String unitname) {
	Method2 method2 = new Method2();
	switch(unitname) {
	case "테란" :
		return method2.배럭리스트함수();
	case "해처리" :
		return method2.해처리리스트함수();
	case "게이트웨이" :
		return method2.게이트웨이리스트함수();
	default:
		return null;
	}
	}

}
