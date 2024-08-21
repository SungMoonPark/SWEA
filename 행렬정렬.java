package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 행렬정렬 {
	
	static int T;
	static int N;
	static int[][] map, map2;
	static int cnt;
	static boolean answer;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N+1][N+1];
			map2 = new int[N+1][N+1];
			for(int i = 1; i < N+1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 1; j < N+1; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}
				for(int i = 1; i <= N; i++)
					for(int j = 1; j <= N; j++)
						map2[i][j] = map[i][j];

				cnt = 0;
				answer = true;
				for(int i = 1; i <= N; i++) {
						for(int j = 1; j <= N; j++) {
							if(map2[i][j] != (i-1) * N + j) {
								System.out.println(i + " "  + j);
								System.out.println(Arrays.deepToString(map2));
								for(int k = 1; k <= Math.max(i, j); k++) {
									for(int l = 1; l <= Math.max(i, j); l++) {
										if(map2[k][l] != (k-1) * N + l) {
											int tmp = map2[k][l];
											map2[k][l] = map2[l][k];
											map2[l][k] = tmp;
											cnt+=1;
									}	
								}
						}
								
					}	
				}					
			}
			System.out.println(cnt);
		}
		
	}
}


