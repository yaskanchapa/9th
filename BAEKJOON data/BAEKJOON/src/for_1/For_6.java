package for_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For_6 {


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		br.close();

		if(N<=100000) {

			for(int i=N; i>0; i--) {
				bw.write(i+"\n");
			}
			bw.flush(); //bw안에 남은 값들 다 배출 버퍼이기 때문에 닫기전에 다 비워야함
			bw.close();

		}

	}
}