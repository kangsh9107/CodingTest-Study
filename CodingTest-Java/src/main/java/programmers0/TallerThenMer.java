package programmers0;

public class TallerThenMer {

	//프로그래머스 Level 0. 머쓱이보다 키 큰 사람
	//https://school.programmers.co.kr/learn/courses/30/lessons/120585
	public static void main(String[] args) {
		TallerThenMer ttm = new TallerThenMer();
		
		int[] array1 = {149, 180, 192, 170};
		int height1 = 167;
		System.out.println(ttm.solution(array1, height1));
		
//		int[] array2 = {180, 120, 140};
//		int height2 = 190;
//		System.out.println(ttm.solution(array2, height2));
	}

	private int solution(int[] array, int height) {
        int answer = 0;
        for(int a : array) {
            if(height < a) answer++;
        }
        return answer;
	}

}
