package programmers1;

public class SplitString {

	//프로그래머스 Level 1. 문자열 나누기
	//https://school.programmers.co.kr/learn/courses/30/lessons/140108
	public static void main(String[] args) {
		SplitString ss = new SplitString();
		
		String s1 = "banana";
		System.out.println(ss.solution(s1));
		
		String s2 = "abracadabra";
		System.out.println(ss.solution(s2));
		
		String s3 = "aaabbaccccabba";
		System.out.println(ss.solution(s3));
	}
	
	public int solution(String s) {
		int answer = 0;
		int cnt = 0;
		String x = "";
		for(int i=0; i<s.length(); i++) {
			if(x.equals("")) {
				x = s.substring(i, i+1);
				cnt++;
				continue;
			}
			
			if(x.equals(s.substring(i, i+1))) cnt++;
			else cnt--;
			
			if(cnt == 0) {
				answer++;
				x = "";
			}
		}
		
		if( !x.equals("") ) answer++;
		
		return answer;
	}

}
