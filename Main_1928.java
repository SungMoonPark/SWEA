package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;

public class Main_1928 {
	
	static int T;
	static String s;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=T; t++) {
			s = br.readLine();
			System.out.println("#" + t + " " + new String(Base64.getDecoder().decode(s)));
		}

	}

}
