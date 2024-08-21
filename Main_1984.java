package swea;

import java.util.Scanner;

public class Main_1984 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t =1; t <= T; t++) {
			int[] arr = new int[10];
			int max = 0;
			int min = 10001;
			int total = 0;
			int cnt = 0;
			
			for(int i = 0; i < 10; i++) {
				int x = sc.nextInt();
				arr[i] = x;
				if(max < x)
					max = x;
				if(min > x)
					min = x;
			}
			
			for(int i = 0; i < 10; i++) {
				if(arr[i] != max && arr[i] != min) {
					total += arr[i];
					cnt += 1;
				}
			}
			System.out.printf("#" + t + " " + "%.0f", ((double)total/cnt));
			System.out.println();
		}
	}
}
