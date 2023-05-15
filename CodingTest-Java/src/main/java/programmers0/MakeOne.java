package programmers0;

public class MakeOne {

	//프로그래머스 Level 0. 1로 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181880
	public static void main(String[] args) {
		MakeOne mo = new MakeOne();
		
		int[] num_list1 = {12, 4, 15, 1, 14};
		System.out.println(mo.solution(num_list1));
	}

	private int solution(int[] num_list) {
		int answer = 0;
		for(int i=0; i<num_list.length; i++) {
			while(num_list[i] > 1) {
				if(num_list[i] % 2 == 0) {
					num_list[i] /= 2;
				} else {
					num_list[i]--;
					num_list[i] /= 2;
				}
				answer++;
			}
		}
		
		return answer;
	}

}
