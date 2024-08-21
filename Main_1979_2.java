package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1979_2 {
	
	static int T;
	static int N;
	static int M;
	static int[][] map;
	static int tmp1, tmp2;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			map = new int[N][N];
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			
			for(int i = 0; i < N; i++) {
				tmp1 = 0;
				tmp2 = 0;
				for(int j = 0; j < N; j++) {
					if(map[i][j] ==1)
						tmp1+=1;
					if(map[i][j] == 0) {
						if(tmp1 == M)
							answer+=1;
						tmp1=0;
					}
					if(map[j][i] == 1)
						tmp2 +=1;
					if(map[j][i] == 0) {
						if(tmp2 ==M) {
							answer+=1;
						}
						tmp2=0;
					}
				}
				if(tmp1== M)
					answer+=1;
				if(tmp2 == M)
					answer+=1;
				
			}
			System.out.println("#" + t + " " + answer);
		}
	

	}

}
