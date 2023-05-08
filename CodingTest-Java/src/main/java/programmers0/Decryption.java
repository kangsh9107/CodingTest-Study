package programmers0;

public class Decryption {

	//프로그래머스 Level 0. 암호 해독
	//https://school.programmers.co.kr/learn/courses/30/lessons/120892
	public static void main(String[] args) {
		Decryption d = new Decryption();
		
		String cipher1 = "dfjardstddetckdaccccdegk";
		int code1 = 4;
		System.out.println(d.solution(cipher1, code1));
		
		String cipher2 = "pfqallllabwaoclk";
		int code2 = 2;
		System.out.println(d.solution(cipher2, code2));
	}

	private String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for(int i=code-1; i<cipher.length(); i+=code) {
            answer.append(cipher.substring(i, i+1));
        }
        return answer.toString();
	}

}
