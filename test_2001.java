package swea;

import java.util.Scanner;

public class test_2001 {
	
		public static void main(String args[]) throws Exception
		{
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for(int t = 1; t < T+1; t++) {
				int N = sc.nextInt();
				int M = sc.nextInt();
				int[][] map = new int[N][N];
				
				int max = 0;	
				
				for(int i = 0; i < N; i++)
					for(int j = 0; j < N; j++)
						map[i][j] = sc.nextInt();
				
				for(int i = 0; i < N; i++)
					for(int j = 0; j < N; j++) {
						int sum = 0;
						for(int k = i; k <i+M; k++)
							for(int l = j; l < j+M; l++) {
								if(l >= N || k >= N)
									continue;
								sum += map[k][l];
							}
						
						if(sum > max)
							max = sum;
					}
				System.out.println("#"+t + " " + max);
			}
		}
	}

