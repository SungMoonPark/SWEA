package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 햄버거다이어트 {
	
	static int T;
	static int N, L;
	static int[][] map;
	static int max;
	static int tmp1, tmp2;

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			map = new int[N+1][2];
			
			for(int i = 0 ; i<N;i++) {
				st= new StringTokenizer(br.readLine());
				map[i][0] = Integer.parseInt(st.nextToken());
				map[i][1] = Integer.parseInt(st.nextToken());
			}
			
			max = 0;
			for(int i = 0; i < N; i++) {
				tmp1 = 0;
				tmp2 = 0;
				check(i);
			}
			
			System.out.println("#" + t + " " + max);
			
			
		}
		
		

	}
	static void check(int i) {
		if(tmp2 + map[i][1] >= L) {
			max = Math.max(tmp1, max);
			return;
		}
		tmp1 += map[i][0];
		tmp2 += map[i][1];
		
		for(int j = i+1; j < N; j++) {
			for(int k = j; k < N; k++) {
				check(k);
			}
			if(tmp2 <= L) {
				max = Math.max(tmp1, max);
			}
			tmp1 = map[i][0];
			tmp2 = map[i][1];
		}
		
					
	}

}
