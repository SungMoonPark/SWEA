package swea;

import java.util.Arrays;
import java.util.Scanner;

public class test_1974 {
	static boolean x = true;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int t=1; t < T+1; t++) {
			int[][] map = new int[9][9];
			for(int i = 0; i < 9; i++)
				for(int j = 0; j < 9; j++)
					map[i][j] = sc.nextInt();
			
			for(int i = 0; i < 9; i++) {
				int[] arr1 = new int[10];
				int[] arr2 = new int[10];
				int[] arr3 = new int[10];
				
				for(int j = 0; j < 9; j++) {
					arr1[map[i][j]] += 1;
					arr2[map[j][i]] += 1;
					
					if((i==0 || i == 3 || i == 6) && (j==0 || j == 3 || j == 6)) {
						for(int k = i; k < i+3; k++) {
							for(int l = j; l < j+3; l++)
								arr3[map[k][l]] += 1;
							}
						for(int k = 1; k < 10; k++) {
							if(arr3[k]!=1) {
								x= false;
								break;
							}
						}
						arr3 = new int[10];
						}
					}
				
				
				for(int j = 1; j < 10; j++) {
					if(arr1[j] != 1 || arr2[j] != 1) {
						x = false;
					}
				}
				
			}
			if(x == true)
				System.out.println("#" +t +" " + 1);
			else
				System.out.println("#" +t +" " + 0);
			x = true;
		}
		
	}

}
