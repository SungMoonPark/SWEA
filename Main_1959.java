package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1959 {
	static int T;
	static int N,M;
	static int[] A;
	static int[] B;
	static int start;
	static int max, min;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			A = new int[N];
			B = new int[M];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++)
				B[i] = Integer.parseInt(st.nextToken());
				
			start = 0;
			max = -Integer.MAX_VALUE;
			
			for(int i = 0; i < Math.abs(N-M) + 1; i++) {
				int cnt = 0;
				if(N-M  > 0) {
					for(int j = 0; j < M; j++) {
						cnt += (A[i+j] * B[j]);
					}
					
					if(cnt > max) {
						max =cnt;
					}
					
				}
				
				else {
					for(int j = 0; j < N; j++) {
						cnt += (A[j] * B[i+j]);
					}
					
					if(cnt > max) {
						max =cnt;
					}
					
				}		
			}
			
			System.out.println("#" + t + " " + max);
			
		}	

	}

}
