package swea;

import java.util.Scanner;

public class test_2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t < T+1; t++) {
			String x = sc.next();
			int answer = 0;
			boolean b = false;
			for(int i = 1; i < 15; i++) {
				if(x.substring(0, i).equals(x.substring(i+1, i+i+1)) && b==false) {
					answer = i+1;
					b=true;
				}
			}
			System.out.println("#" + t + " " + answer);
			
		}

	}

}
