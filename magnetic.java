package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class magnetic {
	
	static int T;
	static int[][] map;
	static int cnt;
	static int ns;
	static boolean nt, st;
	static int N= 100;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t = 1; t <= 10; t++) {
			br.readLine();

			map = new int[N][N];

			for(int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < N; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}
			
	
			
			
			cnt = 0;
			for(int i = 0; i < N; i++) {
				ns = 0;
				for(int j = 0; j < N; j++) {
					if(map[j][i]==1) {
						ns = 1;
					}
					else if(map[j][i] == 2) {
						if(ns ==1) {
							cnt+=1;
							ns = 0;
						}
					}
					
				}
			}
			
			System.out.println("#" + t + " " + cnt);
			
			
			
		}
		
		
	}

}
