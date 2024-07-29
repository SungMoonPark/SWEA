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
            boolean k = true;
			for(int i = 2; i <= 15; i++) {
                for(int j = 0; j < 30; j = j+i) { 
               		if(i+i+j >= 30 || j+i >=30)
                        break;
					if(x.substring(j, j+i).equals(x.substring(j+i, (i+i+j) )) == false) {
                       k = false;       
                }
                   if(b== false && k == true){
                   	b = true; 
                    answer = i;
			}
				}	
                k = true;
            }
			System.out.println("#" + t + " " + answer);

		}

	}

}
