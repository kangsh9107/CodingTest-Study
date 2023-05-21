package programmers0;

public class FromTheNThElement {

	//프로그래머스 Level 0. n 번째 원소부터
	//https://school.programmers.co.kr/learn/courses/30/lessons/181892
	public static void main(String[] args) {
		FromTheNThElement ftnte = new FromTheNThElement();
		
		int[] num_list1 = {2, 1, 6};
		int n1 = 3;
		System.out.println(ftnte.solution(num_list1, n1));
		
//		int[] num_list2 = {5, 2, 1, 7, 5};
//		int n2 = 2;
//		System.out.println(ftnte.solution(num_list2, n2));
	}

	private int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length - n + 1];
		int idx = 0;
		for(int i=n-1; i<num_list.length; i++) {
			answer[idx] = num_list[i];
			idx++;
		}
		
		return answer;
	}

}
