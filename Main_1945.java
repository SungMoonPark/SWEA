package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1945 {
	static int T;
	static int[] arr = {2,3,5,7,11};
	static int num;
	static int[] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			num = Integer.parseInt(br.readLine());
			
			map = new int[5];
			
			sb.append("#" + t + " ");
			
			for(int i = 4; i >= 0; i--) {
				while(true) {
					if(num%arr[i] != 0)
						break;
					num = num/arr[i];
					map[i] +=1;
				}
			}
			for(int i : map)
				sb.append(i + " ");
			
			System.out.println(sb.toString());

		}

	}
}
