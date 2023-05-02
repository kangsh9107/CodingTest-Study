package programmers0;

public class DeleteZero {

	//프로그래머스 Level 0. 0 떼기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181847
	public static void main(String[] args) {
		DeleteZero dz = new DeleteZero();
		
		String n_str1 = "0010";
		System.out.println(dz.solution(n_str1));
		
//		String n_str2 = "854020";
//		System.out.println(dz.solution(n_str2));
	}

	private String solution(String n_str) {
        return Integer.toString(Integer.parseInt(n_str));
	}

}
