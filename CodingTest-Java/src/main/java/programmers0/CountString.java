package programmers0;

public class CountString {

	//프로그래머스 Level 0. 문자열이 몇 번 등장하는지 세기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181871
	public static void main(String[] args) {
		CountString cs = new CountString();
		
		String myString1 = "banana";
		String pat1 = "ana";
		System.out.println(cs.solution(myString1, pat1));
		
		String myString2 = "aaaa";
		String pat2 = "aa";
		System.out.println(cs.solution(myString2, pat2));
	}

	private int solution(String myString, String pat) {
        int answer = 0;
        int len = pat.length();
        for(int i=0; i<=myString.length()-len; i++) {
            if(myString.substring(i, i + len).equals(pat)) answer++;
        }
        return answer;
	}

}
