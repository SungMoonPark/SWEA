package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삼성시의버스노선 {
	
	static int T;
	static int N;
	static int A, B;
	static int P;
	static int C;
	static int[][] map;
	static int cnt;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int t =1; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			map = new int[N][2];
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				map[i][0] = Integer.parseInt(st.nextToken());
				map[i][1] = Integer.parseInt(st.nextToken());
				
			}
			
			
			P = Integer.parseInt(br.readLine());
			sb.append("#" + t + " ");
			for(int i = 0; i < P; i++) {
				C = Integer.parseInt(br.readLine());
				cnt = 0;
				for(int j = 0; j < N; j++) {
					if(C>= map[j][0] && C <= map[j][1])
						cnt+=1;
				}
				sb.append(cnt + " ");
				
			}
			
			System.out.println(sb.toString());
			
		}
	
	}

}
