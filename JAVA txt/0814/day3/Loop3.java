package day3;

public class Loop3 {

	public static void main(String[] args) {

		/*
		 while문 기본 틀
		 while(조건) {
			처리내용
		}
		조건문에 끝점 밖에 못넣기 때문에 증감식을 처리내용부분
		에 넣는다.
		*/

		int num = 1;

		while(num < 10) {
			System.out.println(num);
			num++;
		}


	}

}
