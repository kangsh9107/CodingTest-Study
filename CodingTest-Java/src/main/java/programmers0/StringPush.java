package programmers0;

public class StringPush {

	//프로그래머스 Level 0. 문자열 밀기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120921
	public static void main(String[] args) {
		StringPush sp = new StringPush();
		
		String A1 = "hello";
		String B1 = "ohell";
		System.out.println(sp.solution(A1, B1));
		
		String A2 = "apple";
		String B2 = "elppa";
		System.out.println(sp.solution(A2, B2));
		
		String A3 = "atat";
		String B3 = "tata";
		System.out.println(sp.solution(A3, B3));
		
		String A4 = "abc";
		String B4 = "abc";
		System.out.println(sp.solution(A4, B4));
	}

	private int solution(String A, String B) {
        int answer = -1;
        for(int i=0; i<A.length(); i++) {
            if(A.equals(B)) {
                answer = i;
                break;
            } else {
                A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
            }
        }
        return answer;
	}

}
