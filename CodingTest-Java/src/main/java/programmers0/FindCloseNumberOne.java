package programmers0;

import java.util.Arrays;

public class FindCloseNumberOne {

	//프로그래머스 Level 0. 가까운 1 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181898
	public static void main(String[] args) {
		FindCloseNumberOne fcno = new FindCloseNumberOne();
		
		int[] arr1 = {0, 0, 0, 1};
		int idx1 = 1;
		System.out.println(fcno.solution(arr1, idx1));
		
		int[] arr2 = {1, 0, 0, 1, 0, 0};
		int idx2 = 4;
		System.out.println(fcno.solution(arr2, idx2));
		
		int[] arr3 = {1, 1, 1, 1, 0};
		int idx3 = 3;
		System.out.println(fcno.solution(arr3, idx3));
	}

	private int solution(int[] arr, int idx) {
		String str = Arrays.toString(arr).replaceAll("[\\[\\], ]", "").replaceAll("[0]", " ");
		return str.substring(idx).indexOf("1") == -1 ? -1 : str.substring(idx).indexOf("1") + idx;
	}

}
