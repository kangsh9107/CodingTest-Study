package programmers0;

public class CompareArray {

	//프로그래머스 Level 0. 배열 비교하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181856
	public static void main(String[] args) {
		CompareArray ca = new CompareArray();
		
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		System.out.println(ca.solution(arr1, arr2));
		
//		int[] arr3 = {100, 17, 84, 1};
//		int[] arr4 = {55, 12, 65, 36};
//		System.out.println(ca.solution(arr3, arr4));
//		
//		int[] arr5 = {1, 2, 3, 4, 5};
//		int[] arr6 = {3, 3, 3, 3, 3};
//		System.out.println(ca.solution(arr5, arr6));
	}

	private int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length != arr2.length) {
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            int sum1 = 0;
            int sum2 = 0;
            for(int i=0; i<arr1.length; i++) {
                sum1 += arr1[i];
            }
            for(int i=0; i<arr2.length; i++) {
                sum2 += arr2[i];
            }
            
            if(sum1 != sum2) answer = sum1 > sum2 ? 1 : -1;
        }
        
        return answer;
	}

}
