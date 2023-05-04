package programmers0;

public class PowArrayLength {

	//프로그래머스 Level 0. 배열의 길이를 2의 거듭제곱으로 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181857
	public static void main(String[] args) {
		PowArrayLength pal = new PowArrayLength();
		
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		System.out.println(pal.solution(arr1));
		
//		int[] arr2 = {58, 172, 746, 89};
//		System.out.println(pal.solution(arr2));
	}

	private int[] solution(int[] arr) {
        int len = arr.length;
        int pow = 0;
        for(int i=0; i<=10; i++) {
            pow = (int) Math.pow(2, i);
            if(len == pow)     return arr;
            else if(len < pow) break;
        }
        
        int[] answer = new int[pow];
        for(int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
	}

}
