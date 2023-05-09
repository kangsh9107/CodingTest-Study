package programmers0;

public class AddDigits {

	//프로그래머스 Level 0. 자릿수 더하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120906
	public static void main(String[] args) {
		AddDigits ad = new AddDigits();
		
		int n1 = 1234;
		System.out.println(ad.solution(n1));
		
		int n2 = 930211;
		System.out.println(ad.solution(n2));
	}

	private int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for(int i=0; i<sb.length(); i++) {
            answer += Integer.parseInt(sb.substring(i, i+1));
        }
        return answer;
	}

}
