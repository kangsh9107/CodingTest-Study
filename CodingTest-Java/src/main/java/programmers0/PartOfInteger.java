package programmers0;

public class PartOfInteger {

	//프로그래머스 Level 0. 정수 부분
	//https://school.programmers.co.kr/learn/courses/30/lessons/181850
	public static void main(String[] args) {
		PartOfInteger poi = new PartOfInteger();
		
		double flo1 = 1.42d;
		System.out.println(poi.solution(flo1));
		
		double flo2 = 69.32d;
		System.out.println(poi.solution(flo2));
	}

	private int solution(double flo) {
        return (int) flo;
	}

}
