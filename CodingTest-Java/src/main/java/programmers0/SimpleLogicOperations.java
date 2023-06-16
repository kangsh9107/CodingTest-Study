package programmers0;

public class SimpleLogicOperations {

	//프로그래머스 Level 0. 간단한 논리 연산
	//https://school.programmers.co.kr/learn/courses/30/lessons/181917
	public static void main(String[] args) {
		SimpleLogicOperations slo = new SimpleLogicOperations();
		
		boolean x1 = false;
		boolean x2 = true;
		boolean x3 = true;
		boolean x4 = true;
		System.out.println(slo.solution(x1, x2, x3, x4));
		
//		boolean x5 = true;
//		boolean x6 = false;
//		boolean x7 = false;
//		boolean x8 = false;
//		System.out.println(slo.solution(x5, x6, x7, x8));
	}

	private boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		if ((!x1 && !x2) || (!x3 && !x4)) return false;
		return true;
	}

}
