package programmers0;

public class ConvertingSequencesAccordingToConditions1 {

	//프로그래머스 Level 0. 조건에 맞게 수열 변환하기 1
	//
	public static void main(String[] args) {
		ConvertingSequencesAccordingToConditions1 csatc = new ConvertingSequencesAccordingToConditions1();
		
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		System.out.println(csatc.solution(arr1));
	}

	private int[] solution(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				arr[i] /= 2;
			} else if (arr[i] < 50 && arr[i] % 2 != 0) {
				arr[i] *= 2;
			}
		}
		return arr;
	}

}
