package programmers1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrintSqaureStar {

	//프로그래머스 Level 1. 직사각형 별찍기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12969
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
    }

}
