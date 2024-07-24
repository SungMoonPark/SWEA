package swea;

import java.util.Scanner;

public class test_1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i < N+1; i++) {
			String num = "" +i;
			int cnt = 0;
			for(int j = 0; j < num.length(); j++) {
				if(num.substring(j,j+1).equals("3") ||
					num.substring(j,j+1).equals("6") ||
					num.substring(j,j+1).equals("9"))
					cnt +=1;	
			}
			if(cnt == 0)
				System.out.print(i + " ");
			else {
				for(int k = 0; k < cnt; k++) 
					System.out.print("-");
				System.out.print(" ");
				} 
			
		}

	}

}
