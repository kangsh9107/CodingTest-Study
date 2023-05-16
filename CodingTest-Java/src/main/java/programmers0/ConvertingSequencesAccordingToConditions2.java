package programmers0;

public class ConvertingSequencesAccordingToConditions2 {

	//프로그래머스 Level 0. 조건에 맞게 수열 변환하기 2
	//https://school.programmers.co.kr/learn/courses/30/lessons/181881
	public static void main(String[] args) {
		ConvertingSequencesAccordingToConditions2 csatc = new ConvertingSequencesAccordingToConditions2();
		
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		System.out.println(csatc.solution(arr1));
	}

	private int solution(int[] arr) {
		int answer = 0;
		int cnt = 0;
		boolean isChanged = true;
		
		while (isChanged) {
			answer++;
			cnt = 0;
			
			for (int i=0; i<arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] /= 2;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					arr[i] = (arr[i] * 2) + 1;
				} else {
					cnt++;
				}
			}
			
			if (cnt == arr.length) {
				isChanged = false;
				answer--;
			}
		}
		
		return answer;
	}

}
