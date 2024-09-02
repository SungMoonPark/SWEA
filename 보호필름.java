package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 보호필름 {
	
	static int T;
	static int D, W, K;
	static int[][] map;
	static int[][] tmp;
	static int min;
	static boolean[] visited;
	static int[] visited2;
	static int count;
	static int answer;
	static boolean e;
	static int v;
	static int[] choice = {2,1,0}; // 그대로 1로 0으로
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			D = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[D][W];
			tmp = new int[D][W];
			
			for(int i = 0; i < D; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < W; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
				
			}
			visited = new boolean[D];
			visited2 = new int[D];
			
			min = D*W;
			
			check(0,0);
			System.out.println("#" + t+ " " + min);
		}
	}
	
	static void check(int cnt, int sum) {
		
		if(cnt == D) {
			if(sum >= min) return;
			
			for(int r = 0; r< D; r++)
				for(int c = 0; c<W; c++)
					tmp[r][c] = map[r][c];
			
			for(int i = 0; i < D; i++) {
				if(visited2[i] == 2) continue;
				else if(visited2[i] == 1) {
					Arrays.fill(tmp[i], 1);
				}
				else {
					Arrays.fill(tmp[i], 0);
				}
			}

			loop1: for(int c = 0; c < W; c++) {
				count = 1;
				int t = 0;
				for(int r = 0; r < D-1; r++) {
					if(tmp[r][c] == tmp[r+1][c]) {
						count += 1;
					} else {
						t = Math.max(t, count);
						count = 1;
					}
					t = Math.max(t, count);
					if(t > K)
						continue loop1;
				}

				if(t < K) 
					return;
				
			}
			

			min = Math.min(min, sum);
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			visited2[cnt] = choice[i];
			if(visited2[cnt] == 2)
				check(cnt+1, sum);
			else
				check(cnt+1,sum+1);
		}
		
	}
	

}
