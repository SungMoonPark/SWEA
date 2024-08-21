package swea;

import java.util.Scanner;

public class test_1284 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			int answer;
			
			if(W <= R) {
				answer = Q > P*W ? P*W:Q;
			}
			
			else {
				int b = Q + (W-R) * S;
				answer = P*W > b ? b : P*W;
			}
			
			System.out.println("#" + t + " "  + answer);
		}
	}
}
