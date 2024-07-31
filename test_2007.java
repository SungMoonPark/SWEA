package swea;

import java.util.Scanner;

public class test_2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t < T+1; t++) {
			String x = sc.next();
			int answer = 0;
			boolean b = false; // 가장 먼저 만족하면 true로
            boolean k = true; // for문에서 한번이라도 만족하지 않는 경우 false로
			for(int i = 2; i <= 15; i++) { // 패턴 글자수
                for(int j = 0; j < 30; j = j+i) { // 글자 인덱스
               		if(i+i+j >= 30 || j+i >=30) // 글자 인덱스 벗어난 경우
                        break;
					if(x.substring(j, j+i).equals(x.substring(j+i, (i+i+j))) == false) 
                       k = false;       
					
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
