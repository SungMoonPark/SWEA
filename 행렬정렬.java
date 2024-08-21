package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬정렬 {
	
    static int T;
    static int N;
    static int[][] map;
    static int cnt;
    static boolean answer;
    static int max;
     
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());
            map = new int[N+1][N+1];
            cnt = 0;
            for(int i = 1; i < N+1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 1; j < N+1; j++)
                    map[i][j] = Integer.parseInt(st.nextToken());
            }

               
                w: while(true) {
                	boolean x  = true;
                for(int i = N; i >=1; i--) {
                        for(int j = N; j >=1; j--) {
                            if(map[i][j] != (i-1) * N + j) {
                        
                            	max = i>j? i :j;
                            	for(int k = 1; k <= max;k++ ) {
                            		for(int l = k; l <=max; l++ ) {
                            			int tmp = map[k][l];
                            			map[k][l] = map[l][k];
                            			map[l][k] = tmp;	
                            		}
                            		
                            	} 
                            	cnt+=1;
                            	continue w;
                        }
 
                    }
                  
                }
               	if(x==true)
               		break;    
               
            }
                System.out.println(cnt);   
        }
        }
}


