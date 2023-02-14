package programmers1;

public class BigOrSmall {

	//프로그래머스 Level 1. 크기가 작은 부분 문자열
	//https://school.programmers.co.kr/learn/courses/30/lessons/147355
	public static void main(String[] args) {
		BigOrSmall bos = new BigOrSmall();
		
		String t1 = "3141592";
		String p1 = "271";
		System.out.println(bos.solution(t1, p1));
		
//		String t2 = "500220839878";
//		String p2 = "7";
//		System.out.println(bos.solution(t2, p2));
//		
//		String t3 = "10203";
//		String p3 = "15";
//		System.out.println(bos.solution(t3, p3));
	}
	
	public int solution(String t, String p) {
		int answer = 0;
		for(int i=0; i<=t.length()-p.length(); i++) {
			if(Long.parseLong(p) >= Long.parseLong(t.substring(i, i+p.length()))) answer++;
		}
		return answer;
	}

}
