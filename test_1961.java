package swea;

import java.util.Scanner;

public class test_1961 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);	
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++)
				for(int j = 0; j < N; j++)
					arr[i][j] = sc.nextInt();
			
			int num = 0;
			int reverse_num = N-1;
			int arr1_num = 0;
			int arr2_num = N-1;
			int arr3_num = N-1;
			
			// reverse arr[][0], reverse arr[2][],  arr[][2]
			// reverse arr[][1], reverse arr[1][], arr[][1]
			// reverse arr[][2], reverse arr [0][], arr[][0]
			
			
            System.out.println("#" + t + " ");
			for(int i = 0; i < N; i++) {
				
				
				for(int j = 0; j < N; j++) {
					System.out.print(arr[reverse_num--][arr1_num]);
				}
				System.out.print(" ");
				
				reverse_num = N-1;
				for(int j = 0; j < N; j++) {
					System.out.print(arr[arr2_num][reverse_num--]);
				}	
				System.out.print(" ");
				
				reverse_num = N-1;
				for(int j = 0; j < N; j++) {
					System.out.print(arr[num++][arr3_num ]);
				}	
				num = 0;
				arr1_num++;
				arr2_num--;
				arr3_num--;
				System.out.println();
			
			}
		}
	}
}
