package hukusyu1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hukusyu1 {

	public void 출력함수() {
		System.out.println("Hello World!");
	}

	public void 데이터타입함수() {
		String name = "김태환";
		String name2;
		name2 = "김태환2";

		int age = 13;
		float agef = 13.0f;

		boolean isHuman = true;

		System.out.println("이름:"+ name);
		System.out.println("이름2:"+ name2);
		System.out.println("나이:"+ age);
		System.out.println("나이f:"+ agef);
		System.out.println("사람인가:"+ isHuman);
	}

	public void 반복함수for() {
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
	}

	public void 구구단2단함수() {
		int num = 2;
		for(int i =0; i<10; i++) {
			System.out.println("구구단"+num+"단함수");
			System.out.println(num*(i+1));
		}

	}
	public void 반복함수while() {

		int num = 1;
		while(num<10) {
			System.out.println(num);
			num++;
		}
	}

	public void 컨티뉴함수() {
		System.out.println("5는빼고출력");
		for(int i =0; i<11; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("5에서브레이크");
		for(int i = 0; i<11; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}

	public void 홀짝판별함수() {

		for(int i = 0; i<11; i++) {

			if(i%2==0) {
				System.out.println(i+"는짝수입니다.");
			}else if(i%2==1){
				System.out.println(i+"는홀수입니다.");
			}
		}
	}

	public void 계절판별함수if() {
		Scanner sc = new Scanner(System.in);
		int month;

		System.out.println("현재 달을 입력해 주십시오(월)");
		month = sc.nextInt();

		if(month>2 && month<6) {
			System.out.println("봄입니다.");
		}else if(month>5 && month<10) {
			System.out.println("여름입니다.");

		}else if(month>9 && month<12) {
			System.out.println("가을입니다.");

		}else if(month>11 && month<3) {
			System.out.println("겨울입니다.");
		}else {
			System.out.println("입력이 잘못되었습니다.");
		}

	}
	public void 계절판별함수switch() {
		Scanner sc = new Scanner(System.in);
		String season;

		System.out.println("알고싶은 계절을 입력해 주십시오");
		season = sc.next();

		switch(season){
			case "봄" :
				System.out.println("3월~5월");
				break;
			case "여름" :
				System.out.println("6월~9월");
				break;
			case "가을" :
				System.out.println("10월~11월");
				break;
			case "겨울" :
				System.out.println("12월~2월");
				break;
			default:
				System.out.println("입력오류");
		}
	}

	public void 배열함수() {

		Scanner sc = new Scanner(System.in);
		String 이름;
		String[] 반1 = new String[3];

//		배열값 입력
		for(int i = 0; i<3; i++) {
			System.out.println(i + "번째 배열에 넣을 이름을 입력해주세요");
			이름 = sc.next();
			반1[i]=이름;
		}
//		배열 출력
		System.out.println("현재 배열값은 이하와 같습니다.");
		for(int i = 0; i<3; i++) {
			System.out.println(반1[i]);
		}
	}

	public void 리스트함수() {
//		※숫자의 경우 int가 아닌 Integer로 지정해야함
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		String name;

//		리스트값 입력
		for(int i = 0; i<3; i++) {
			System.out.println(i+"번째 인원의 이름을 입력해주십시오.");
			name = sc.next();
			nameList.add(name);
		}
//		리스트 출력
		System.out.println("현재 리스트 값은 다음과 같습니다.");
		for(int i =0; i<3; i++) {
			System.out.println(nameList.get(i));
		}
	}

	public void 리스트확장for문함수() {
		List<String> unitList = new ArrayList<String>();
		unitList.add("질럿");
		unitList.add("마린");
		unitList.add("저글링");

//		확장for문이용한 출력
		for(String unitname : unitList) {
			System.out.println(unitname);
		}
	}

	public void 맵함수() {
		Map<String,String> classMap = new HashMap<String,String>();

		classMap.put("1반","일반철");
		classMap.put("2반","이반철");
		classMap.put("3반","삼반철");

		for(String name:classMap.keySet()) {
			System.out.println(name); //키값을 출력
			System.out.println(classMap.get(name)); //키값에대한 값을 출력
		}
	}

	public void 맵과리스트함수(){
		Scanner sc = new Scanner(System.in);
		String name;

//		1. 리스트 작성
		List<String> nameList1 = new ArrayList<String>();
//			리스트 값 입력
		System.out.println("1반인원 3명의 이름을 입력해주세요");
		for(int i=0; i<3; i++) {
			name = sc.next();
			nameList1.add(name);
		}
		List<String> nameList2 = new ArrayList<String>();
		System.out.println("2반인원 3명의 이름을 입력해주세요");
		for(int i=0; i<3; i++) {
			name = sc.next();
			nameList2.add(name);
		}
		List<String> nameList3 = new ArrayList<String>();
		System.out.println("3반인원 3명의 이름을 입력해주세요");
		for(int i=0; i<3; i++) {
			name = sc.next();
			nameList3.add(name);
		}

//		2. 맵작성(리스트에 키값 부여)
		Map<String,List<String>> classMap = new HashMap<String,List<String>>();

		classMap.put("1반", nameList1);
		classMap.put("2반", nameList2);
		classMap.put("3반", nameList3);

		for(String key:classMap.keySet()) {
			for(String name2 :classMap.get(key)) {
				System.out.println(key+":"+name2);
			}
		}
//		classMap.get(key)=nameList〇
//		맵은 출력시 키값을 넣어줘야하고 리스트는 출력시 인덱스번호를 넣어줘야함
//		확장for문사용시 인덱스 번호를 안넣어도 됨
	}
}
