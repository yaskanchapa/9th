package for_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For2_1 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		br.close();

		for(int i=T; i>0; i--) { // T가 5라면 i=5가 되므로 5번,4번,3번반복으로 점차 줄어간다.
			// 공백을 출력하는 반복문과 별을 출력하는 반복문을 구성한다.

			for(int j=i-1; j>0; j--) { //공백을T가5일시 첫줄은 공백4 두번째는3 순으로 공백은1까지줄어감
				bw.write(" ");
			}

			for(int k=1; k<=T+1-i; k++) { // 별은 T가5일시 1부터 5까지 늘어감
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
