package day5;

import java.util.ArrayList;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {

//		int 는 Integer 쓰고 불린은 Boolean 쓰면됨
//		List<Integer> ageList = new ArrayList<Integer>();
//		List<Boolean> ageList = new ArrayList<Boolean>();

		List<Integer> ageList = new ArrayList<Integer>();
		ageList.add(13);
		ageList.add(23);
		ageList.add(43);

		for(int age : ageList) {
			System.out.println(age);
		}

		System.out.println("1에서 1만까지 담고 출력");

		List<Integer> numList = new ArrayList<Integer>();

		for(int i = 1; i<10001; i++) {
			numList.add(i);
		}

		for(int num : numList) {
			System.out.println(num);
		}

	}

}
