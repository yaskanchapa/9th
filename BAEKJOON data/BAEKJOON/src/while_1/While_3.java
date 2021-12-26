package while_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class While_3 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int fNum = Integer.parseInt(br.readLine());
		int fNumCopy = fNum;
		int cnt = 0;

		if(0<=fNum&&fNum<=99) {
			while(true) {
				int BunNum1 = fNumCopy/10;
				int BunNum2 = fNumCopy%10;
				int FusionNum = BunNum1+BunNum2;
//				System.out.println("BunNum1: "+BunNum1);
//				System.out.println("BunNum2: "+BunNum2);
				BunNum1 = BunNum2;
				BunNum2 = FusionNum;
				int rsNum = (BunNum1*10)+(BunNum2%10);
				fNumCopy = rsNum;
				cnt++;
//				System.out.println("FusionNum: "+FusionNum);
//				System.out.println("rsNum: "+rsNum);
//				System.out.println("cnt: "+cnt);
//				System.out.println("fNumCopy: "+fNumCopy);
				if(fNum==rsNum) {
					break;
				}
			}
			bw.write(cnt+"\n");
		}
		bw.flush();
		bw.close();
	}
}
