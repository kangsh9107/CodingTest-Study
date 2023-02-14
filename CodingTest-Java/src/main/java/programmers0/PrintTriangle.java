package programmers0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintTriangle {

	//프로그래머스 Level 0. 직각삼각형 출력하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120823
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
