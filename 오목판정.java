package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오목판정 {
	
	static int T;
	static int N;
	static char[][] map;
	static String answer;
	static int[] dr = {1,0,1,-1,1,-1,-1,0};
	static int[] dc = {0,1,-1,1,1,-1,0,-1};
	static int nr,nc;
	static int cnt;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		t: for(int t = 1; t <= T; t++) {
			N  = Integer.parseInt(br.readLine());
			map = new char[N][N];
			
			for(int i = 0; i < N; i++)
				map[i] = br.readLine().toCharArray();
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <N; j++) {

					for(int k = 0; k < 8; k++) {
						nr = i;
						nc = j;
						cnt = 0;
						while(true) {
							if(nr>=N || nc >= N || nr < 0 || nc <0)
								break;
							
							if(map[nr][nc] == 'o')
								cnt+=1;
							else
								break;
							
							nr = nr  + dr[k];
							nc = nc + dc[k];
							
						}
						//System.out.println(i + " " + j + " : "  +cnt);
						if(cnt >= 5) {
							System.out.println("#" + t + " " + "YES");
							continue t;
						}
					}
					
					
				}
			}
			
			System.out.println("#" + t + " " + "NO");
			
		
		}
		

	}

}
