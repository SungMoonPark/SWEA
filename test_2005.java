package swea;

import java.util.Arrays;
import java.util.Scanner;

public class test_2005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t < T+1; t++) {
			int n = sc.nextInt();
			System.out.println("#" + t);
			int[] arr = new int[n];
			int[] arr2 = new int[n];
			
			for(int i = 0; i < n; i++ ) {
				for(int j = 1; j < i; j++)
					arr2[j] = arr[j] + arr[j-1];
				
				arr2[i] = 1;
				for(int x: arr2) {
					if(x != 0)
						System.out.print(x + " ");
				}
				arr = Arrays.copyOf(arr2, n);	
				System.out.println();
			}
			
			
		}
		

	}

}
