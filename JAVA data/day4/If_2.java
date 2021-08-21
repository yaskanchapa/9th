package day4;

public class If_2 {

/*
== : 같다
!= : 다르다
+= : 더한후 값에 넣는다.
-=: 뺀후 값에 넣는다.

글자 비교할 때 는
대상 .equals()로사용하는걸 추천
==경우는 저장되는 메모리 값이 다를경우 동일한 문자라 하여도 다른 값으로 처리 하기 때문에
대상에는 null값은 올 수가 없다. null값과 비교하려면 null대상을 ()에 넣고 비교한다.
*/
	public static void main(String[] args) {

		// 1에서 10까지 수 중 홀수일 경우 "홀수입니다." 짝수일경우 "짝수입니다.출력
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				System.out.println(i+"는(은)짝수입니다.");
			}else {
				System.out.println(i+"는(은)홀수입니다.");
			}
		}
	}

}
