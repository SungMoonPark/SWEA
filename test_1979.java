package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_1979 { 
	
	static int[] dr = {1,-1,0,0};
	static int[] dc = {0,0,1,-1};
	static int num;
	static int N;
	static int K;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}
			
			num = 0;
			int[][] visited = new int[N][N];
			
			for(int i = 0; i <N; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 1) {
						int tmp = 0;
						boolean ch = true;
						for(int k = 0; k < 4; k++) {
							int idx_r = i;
							int idx_c = j;
							while(true) {
								if(check(idx_r,idx_c) || map[idx_r][idx_c] == 0)
									break;
								if(visited[idx_r][idx_c] == -1)
									ch = false;
								tmp += 1;
								idx_r += dr[k];
								idx_c += dc[k];
							}
							if(k%2 == 1) {
								if(ch== true && tmp-1==K) {
									num+=1;
								}
								tmp = 0;
								ch = true;
							}					
						}
						visited[i][j] = -1;
					}
				}
			}
			System.out.println("#" + t + " "  + num);
		}
	}
	
	static boolean check(int r, int c) {
		return r>= N || r < 0 || c >= N || c < 0;
	}
	}