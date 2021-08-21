package day5;

public class Array_2 {

	public static void main(String[] args) {
//		배열은 일반적으로 선언해둔 후 나중에 값을 담는 방식으로 처리하는경우가 많음

//		String[] nameArray = new String[몇개 넣을건지]; 4의경우 4개의 값을 담는다는 뜻
//		4개 넣는다고 하고 3개만 넣으면 빈 곳은 null 근데 5개 넣으면 에러 뜸
		String[] nameArray = new String[4];

//		해당 인덱스에 값 넣는 법
		nameArray[0] = "고길동";
		nameArray[1] = "둘리";
		nameArray[2] = "도우너";
		nameArray[3] = "마이클";

//		반복문을 통해 배열 안에 값 다 출력하기
//		조건에서 nameArray가 몇까지 있는지 일일히 알아보기 귀찮기 때문에 길이값을 넣어주면 된다.
//		i<4 안하고 nameArray.length를 넣음 됨
		System.out.println("<둘리네 배열 출력>");
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}

		int[] ageArray = new int[5];

		ageArray[0] = 12;
		ageArray[1] = 33;
		ageArray[2] = 25;
		ageArray[3] = 53;
		ageArray[4] = 68;

		System.out.println("<숫자5가지 배열 출력>");
		for(int i = 0; i < ageArray.length; i++) {
			System.out.println(ageArray[i]);
		}

	}

}
