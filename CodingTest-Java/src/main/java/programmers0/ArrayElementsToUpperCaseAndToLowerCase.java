package programmers0;

public class ArrayElementsToUpperCaseAndToLowerCase {

	//프로그래머스 Level 0. 배열에서 문자열 대소문자 변환하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181875
	public static void main(String[] args) {
		ArrayElementsToUpperCaseAndToLowerCase aeul = new ArrayElementsToUpperCaseAndToLowerCase();
		
		String[] strArr1 = {"AAA","BBB","CCC","DDD"};
		System.out.println(aeul.solution(strArr1));
		
		String[] strArr2 = {"aBc","AbC"};
		System.out.println(aeul.solution(strArr2));
	}

	private String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
	}

}
