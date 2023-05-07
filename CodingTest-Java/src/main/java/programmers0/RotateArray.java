package programmers0;

public class RotateArray {

	//프로그래머스 Level 0. 배열 회전시키기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120844
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		
		int[] numbers1 = {1, 2, 3};
		String direction1 = "right";
		System.out.println(ra.solution(numbers1, direction1));
		
		int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
		String direction2 = "left";
		System.out.println(ra.solution(numbers2, direction2));
	}

	private int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")) {
            for(int i=0; i<numbers.length; i++) {
                if(i != 0) answer[i] = numbers[i-1];
                else answer[0] = numbers[numbers.length-1];
            }
        } else {
            for(int i=0; i<numbers.length; i++) {
                if(i != numbers.length-1) answer[i] = numbers[i+1];
                else answer[numbers.length-1] = numbers[0];
            }
        }
        return answer;
	}

}
