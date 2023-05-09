package programmers0;

public class NextNumber {

	//프로그래머스 Level 0. 다음에 올 숫자
	//https://school.programmers.co.kr/learn/courses/30/lessons/120924
	public static void main(String[] args) {
		NextNumber nn = new NextNumber();
		
		int[] common1 = {1, 2, 3, 4};
		System.out.println(nn.solution(common1));
		
		int[] common2 = {2, 4, 8};
		System.out.println(nn.solution(common2));
	}

	private int solution(int[] common) {
        int answer = 0;
        if(Math.abs(common[1] - common[0]) == Math.abs(common[2] - common[1])) {
            answer = common[common.length-1] + common[1] - common[0];
        } else {
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        
        return answer;
	}

}
