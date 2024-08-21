package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1966 {
	static int T;
	static int N;
	static int[] map;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append(" ");
			
			N = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			map = new int[N];
			for(int i = 0; i < N; i++)
				map[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(map);
			
			for(int i: map)
				sb.append(i).append(" ");
			
			System.out.println(sb.toString());
			
		}
		

	}
}
