package programmers0;

public class OddVsEven {

	//프로그래머스 Level 0. 홀수 vs 짝수
	//https://school.programmers.co.kr/learn/courses/30/lessons/181887
	public static void main(String[] args) {
		OddVsEven ove = new OddVsEven();
		
		int[] num_list1 = {4, 2, 6, 1, 7, 6};
		System.out.println(ove.solution(num_list1));
		
//		int[] num_list2 = {-1, 2, 5, 6, 3};
//		System.out.println(ove.solution(num_list2));
	}

	private int solution(int[] num_list) {
		int odd = 0;
		int even = 0;
		for (int i=0; i<num_list.length; i++) {
			if (i % 2 == 0) {
				odd += num_list[i];
			} else {
				even += num_list[i];
			}
		}
		
		return odd > even ? odd : even;
	}

}
