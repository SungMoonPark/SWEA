package swea;

import java.util.Scanner;

public class test_1204 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T; t++){
        int N  = sc.nextInt();
        int[] arr = new int[101];
        for(int i = 0; i <1000; i++){
            int num = sc.nextInt();
            arr[num] +=1;
        }
        
        int answer = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] >= max) {
        		answer = i;
        		max = arr[i];
        	}
        }
        System.out.printf("#%d %d\n", N, answer);
        }
    }

}
