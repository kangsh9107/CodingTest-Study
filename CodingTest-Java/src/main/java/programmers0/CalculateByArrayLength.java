package programmers0;

public class CalculateByArrayLength {

	//프로그래머스 Level 0. 배열의 길이에 따라 다른 연산하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181854
	public static void main(String[] args) {
		CalculateByArrayLength cbal = new CalculateByArrayLength();
		
		int[] arr1 = {49, 12, 100, 276, 33};
		int n1 = 27;
		System.out.println(cbal.solution(arr1, n1));
		
//		int[] arr2 = {444, 555, 666, 777};
//		int n2 = 100;
//		System.out.println(cbal.solution(arr2, n2));
	}

	private int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0) {
            for(int i=1; i<arr.length; i+=2) {
                arr[i] += n;
            }
        } else {
            for(int i=0; i<arr.length; i+=2) {
                arr[i] += n;
            }
        }
        return arr;
	}

}
