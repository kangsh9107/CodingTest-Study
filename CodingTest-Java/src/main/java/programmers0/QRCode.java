package programmers0;

public class QRCode {

	//프로그래머스 Level 0. qr code
	//https://school.programmers.co.kr/learn/courses/30/lessons/181903
	public static void main(String[] args) {
		QRCode qrc = new QRCode();
		
		int q1 = 3;
		int r1 = 1;
		String code1 = "qjnwezgrpirldywt";
		System.out.println(qrc.solution(q1, r1, code1));
		
//		int q2 = 1;
//		int r2 = 0;
//		String code2 = "programmers";
//		System.out.println(qrc.solution(q2, r2, code2));
	}

	private String solution(int q, int r, String code) {
		StringBuilder answer = new StringBuilder();
		for (int i=r; i<code.length(); i+=q) {
			if (i <= code.length()) {
				answer.append(code.charAt(i));
			}
		}
		
		return answer.toString();
	}

}
