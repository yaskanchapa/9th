package day6;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {

	public static void main(String[] args) {

//	Map<키용 타입,데이터값 타입> hashMap = new HashMap<키용 타입,데이터값 타입>();
	Map<String,String> secondNameMap = new HashMap<String,String>();

	secondNameMap.put("김","정화");
	secondNameMap.put("서","현주");
	secondNameMap.put("모리","료타로");

//	System.out.println(secondName.get("김"));

	for(String secondName:secondNameMap.keySet()) {
//		secondName에 secondNameMap.keySet()을 함으로써
//		secondName이란 변수에 secondNameMap의 값 중 키값을 넣게 된다.
		System.out.println("변수 secondName을 출력="+secondName);
		System.out.println("그래서 출력 원할땐 다음과 같이 입력해야됨 secondNameMap.get(secondName)");
		System.out.println("그러면 값이 출력됨"+secondNameMap.get(secondName));
	}
	Map<String,Integer> ageMap = new HashMap<String,Integer>();

	ageMap.put("김정화", 37);
	ageMap.put("서현주", 36);
	ageMap.put("모리", 33);

	for(String agekey:ageMap.keySet()) {
//		좌항의 타입은 키 값의 타입이 들어가야됨
//		age에 ageMap.keySet()을 함으로써
//		age이란 변수에 ageMap의 값 중 키값을 넣게 된다.
		System.out.println(agekey+"님의 나이는"+ageMap.get(agekey)+"입니다.");
//		agekey에 키값을 담아 두고 get으로 키값을 불러오면 해당 값이 출력되기 때문
	}




	}

}
