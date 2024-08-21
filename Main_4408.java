package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4408 {
	
	static int N;
	static int T;
	static int[][] map;
	static int answer;
	static int[] map2;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			map = new int[N][2];
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				map[i][0] = Integer.parseInt(st.nextToken());
				map[i][1] = Integer.parseInt(st.nextToken());
			}
			
			answer = 0;
			Arrays.sort(map, (o1, o2) -> {
				return o1[0]-o2[0];
			});
			
			map2 = new int[201];
			
			for(int i = 0; i < N; i++) {
				if(map[i][0] > map[i][1]) {
					for(int j = (map[i][0]+1)/2; j  >= (map[i][1]+1)/2; j--) {
						map2[j] += 1;
					}
				
				}
				
				else {
					for(int j = (map[i][1]+1)/2; j  >= (map[i][0]+1)/2; j--) {
						map2[j] += 1;
					}
				
				}
			}
			answer = 0;
			for(int i = 0; i < 201; i++) {
				if(map2[i] > answer )
					answer = map2[i];
			}
			
			System.out.println("#" + t + " " + answer);
			
			
		}
		
	}

		

	}


