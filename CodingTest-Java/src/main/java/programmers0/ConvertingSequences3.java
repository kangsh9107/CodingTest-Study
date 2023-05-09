package programmers0;

public class ConvertingSequences3 {

	//프로그래머스 Level 0. 조건에 맞게 수열 변환하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181835
	public static void main(String[] args) {
		ConvertingSequences3 cs = new ConvertingSequences3();
		
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		int k1 = 3;
		System.out.println(cs.solution(arr1, k1));
		
		int[] arr2 = {1, 2, 3, 100, 99, 98};
		int k2 = 2;
		System.out.println(cs.solution(arr2, k2));
	}

	private int[] solution(int[] arr, int k) {
		if(k % 2 != 0) {
			for(int i=0; i<arr.length; i++) {
				arr[i] *= k;
			}
		} else {
			for(int i=0; i<arr.length; i++) {
				arr[i] += k;
			}
		}
		
		return arr;
	}

}
