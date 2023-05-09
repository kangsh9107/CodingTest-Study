package programmers0;

public class StringInsideString {

	//프로그래머스 Level 0. 문자열안에 문자열
	//https://school.programmers.co.kr/learn/courses/30/lessons/120908
	public static void main(String[] args) {
		StringInsideString sis = new StringInsideString();
		
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		System.out.println(sis.solution(str1, str2));
		
//		String str3 = "ppprrrogrammers";
//		String str4 = "pppp";
//		System.out.println(sis.solution(str3, str4));
//		
//		String str5 = "AbcAbcA";
//		String str6 = "AAA";
//		System.out.println(sis.solution(str5, str6));
	}

	private int solution(String str1, String str2) {
        int answer = 2;
        for(int i=0; i<str1.length(); i++) {
            if(i < str1.length()-str2.length()) {
                if(str1.substring(i, i+str2.length()).equals(str2)) answer = 1;
            } else if(i == str1.length()-str2.length()) {
                if(str1.substring(i).equals(str2)) answer = 1;
            }
        }
        return answer;
	}

}
