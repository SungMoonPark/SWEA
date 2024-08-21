package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1288 {
	static int T; 
	static int N;
	static int[] cnt;
	static int num = 0;
	static int answer;
	static int x;
	static String num_str;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t<= T; t++) {
			
			N = Integer.parseInt(br.readLine());
			cnt = new int[10];
			
			answer = 1;
			x = 1;
			
			while(true) {
				
				num_str = N*x + "";
				for(int i = 0; i < num_str.length(); i++) {
					cnt[num_str.charAt(i) - '0'] = 1;
				}
				
				num = 0;
				for(int i = 0; i < 10;i++) {
					if(cnt[i] != 0) {
						num+=1;
					}
				}
				if(num == 10) {
					break;
				}
				
				x++;
				answer++;
				
			}
			
			
			sb.append("#" + t + " ").append(answer*N).append('\n');
			
		}
		
		System.out.println(sb.toString());
		
	}
}
