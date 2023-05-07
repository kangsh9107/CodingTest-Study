package programmers0;

public class SharingPizza3 {

	//프로그래머스 Level 0. 피자 나눠 먹기 (3)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120816
	public static void main(String[] args) {
		SharingPizza3 sp = new SharingPizza3();
		
		int slice1 = 7;
		int n1 = 10;
		System.out.println(sp.solution(slice1, n1));
		
		int slice2 = 4;
		int n2 = 12;
		System.out.println(sp.solution(slice2, n2));
	}

	private int solution(int slice, int n) {
        return ((double)n/slice) > (int)((double)n/slice) ? ((n/slice)+1) : (n/slice);
	}

}
