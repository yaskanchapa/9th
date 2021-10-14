package day8;

public class Method_4 {

	public static void main(String[] args) {

		// 파라메타(인수)와 반환값(리턴)이 존재
		// 파라메타값 문자 두개를 받아서 합친 후 합친 결과값을 반환
		// 메소드명:addTwoWord
		String msg = addTwoWord("안","녕");
		System.out.println(msg);
	}
	static String addTwoWord(String word1, String word2) {
		String addWord = word1 + word2;
		return addWord;
	}
}
