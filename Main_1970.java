package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1970 {
	static int T;
	static int N;
	static int[] map = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			sb.append("#" + t +"\n");
			
			for(int i = 0; i < map.length; i++) {
				sb.append((N/map[i]) + " ");
				N = N%map[i];
			}
			
			System.out.println(sb.toString());
		}

	}
}
