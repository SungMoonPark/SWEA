package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_1983 {
	
	static int T;
	static int N;
	static int K;
	static Map<Integer, Double> map;
	static double N1,N2,N3;
	static double num;
	static int rank;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<= T; t++) {
			sb.append("#" + t + " ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			map = new HashMap<>();
			
			for(int i= 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				N1 = 0.35 * Integer.parseInt(st.nextToken());
				N2 = 0.45 * Integer.parseInt(st.nextToken());
				N3 = 0.20 * Integer.parseInt(st.nextToken());
				map.put(i, N1+N2+N3);
			}
			
			num = map.get(K);
			rank = 0;
			
			for(int i = 1; i <= N; i++) {
				if(i==K)
					continue;
				else {
					if(num < map.get(i)) {
						rank +=1;
					}
				}
			}
			
			if(rank < N/10) {
				sb.append("A+\n");
			} else if (rank < N/10 * 2) {
				sb.append("A0\n");
			} else if (rank < N/10 * 3) {
				sb.append("A-\n");
			} else if (rank < N/10 * 4) {
				sb.append("B+\n");
			} else if (rank < N/10 * 5) {
				sb.append("B0\n");
			} else if (rank < N/10 * 6) {
				sb.append("B-\n");
			} else if (rank < N/10 * 7) {
				sb.append("C+\n");
			} else if (rank < N/10 * 8) {
				sb.append("C0\n");
			} else if (rank < N/10 * 9) {
				sb.append("C-\n");
			} else {
				sb.append("D0\n");
			}
		
		}
		System.out.println(sb.toString());
		
	}

}
