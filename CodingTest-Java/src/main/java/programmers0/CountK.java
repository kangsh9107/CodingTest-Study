package programmers0;

public class CountK {

	//프로그래머스 Level 0. k의 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120887
	public static void main(String[] args) {
		CountK ck = new CountK();
		
		int i1 = 1;
		int j1 = 13;
		int k1 = 1;
		System.out.println(ck.solution(i1, j1, k1));
		
		int i2 = 10;
		int j2 = 50;
		int k2 = 5;
		System.out.println(ck.solution(i2, j2, k2));
		
		int i3 = 3;
		int j3 = 10;
		int k3 = 2;
		System.out.println(ck.solution(i3, j3, k3));
	}

	private int solution(int i, int j, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int m=i; m<=j; m++) {
            sb.append(m);
        }
        String str = sb.toString();
        answer = str.length() - str.replaceAll(Integer.toString(k), "").length();
        return answer;
	}

}
