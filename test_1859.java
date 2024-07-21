package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_1859 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t <= T; t++ ) {
			int N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());

			long answer = 0;
			
			for(int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			
			int max = arr[N-1];
			for(int i = N-2; i >= 0; i--) {
				if (max > arr[i])
					answer += (max- arr[i]);
				else
					max = arr[i];
			}
			
			System.out.println("#" + t + " " + answer);			
		}
	}
}
