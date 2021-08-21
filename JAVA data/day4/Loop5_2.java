package day4;

public class Loop5_2 {

	public static void main(String[] args) {

		// 2중반복문
		for(int i = 2; i < 10; i++) {
			// 구구단 몇단 인지 출력문
			System.out.println("구구단"+i+"단입니다.");
			// 각 단에서 ×9 까지 돌리기 위한 반복문
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "×" + j + "=" + (i*j));
			}
		}
	}

}
