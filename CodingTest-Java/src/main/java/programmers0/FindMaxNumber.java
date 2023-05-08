package programmers0;

public class FindMaxNumber {

	//프로그래머스 Level 0. 가장 큰 수 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120899
	public static void main(String[] args) {
		FindMaxNumber fmn = new FindMaxNumber();
		
		int[] array1 = {1, 8, 3};
		System.out.println(fmn.solution(array1));
		
		int[] array2 = {9, 10, 11, 8};
		System.out.println(fmn.solution(array2));
	}

	private int[] solution(int[] array) {
        int[] answer = new int[2];
        int index = 0;
        int max = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                index = i;
                max = array[i];
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
	}

}
