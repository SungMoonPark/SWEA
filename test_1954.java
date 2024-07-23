package swea;

import java.util.Scanner;

public class test_1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] dr = {0,1,0,-1};
		int[] dc = {1,0,-1,0};
		
		for(int t= 1; t < T+1; t++) {
			int n = sc.nextInt();
			int[][] map = new int[n][n];
			int cnt = 1;
			int r = 0;
			int c = 0;
			
			int nr = 0;
			int nc = 0;
			
			while (cnt <= (n*n)) {
				map[r][c] = cnt++;
				
				r += dr[nr];
				c += dc[nc];
				
				if(r >= n || c >= n || r < 0 || c < 0 || map[r][c] != 0) {
					r -= dr[nr];
					c -= dc[nc];
					nr = (nr+1)%4;
					nc = (nc+1)%4;
					
					r += dr[nr];
					c += dc[nc];		
				}
			}
			
			System.out.println("#" + t);
			for(int i =0; i <n;i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
		}

	}

}
