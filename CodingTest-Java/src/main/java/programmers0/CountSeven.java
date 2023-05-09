package programmers0;

public class CountSeven {

	//프로그래머스 Level 0. 7의 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120912
	public static void main(String[] args) {
		CountSeven cs = new CountSeven();
		
		int[] array1 = {7, 77, 17};
		System.out.println(cs.solution(array1));
		
		int[] array2 = {10, 29};
		System.out.println(cs.solution(array2));
	}

	private int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        for(int a : array) {
            sb.append(a);
        }
        String answer = sb.toString().replaceAll("[012345689]", "");
        return answer.length();
	}

}
