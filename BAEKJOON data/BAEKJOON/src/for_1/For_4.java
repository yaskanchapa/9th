package for_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class For_4 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		String s = br.readLine(); // String
		int T = Integer.parseInt(br.readLine()); //Int

		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer변수값에 문자열 넣기
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			bw.write(A+B+"\n");
		}
		bw.flush();
		bw.close();
	}
}
