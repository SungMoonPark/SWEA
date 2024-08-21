package swea;

import java.util.Scanner;

public class test_1989 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			String num = sc.next();
			int x = 1;
			
			for(int i = 0; i < num.length()/2; i++) {
				if(!(num.charAt(i) == num.charAt(num.length() - i-1)))
					x = 0;
			}
			
			System.out.println("#" + t + " " + x);
			
		}
	}
}
