package programmers0;

public class SeparateBySpace1 {

	//프로그래머스 Level 0. 공백으로 구분하기 1
	//https://school.programmers.co.kr/learn/courses/30/lessons/181869
	public static void main(String[] args) {
		SeparateBySpace1 sbs = new SeparateBySpace1();
		
		String my_string1 = "i love you";
		System.out.println(sbs.solution(my_string1));
		
		String my_string2 = "programmers";
		System.out.println(sbs.solution(my_string2));
	}

	private String[] solution(String my_string) {
        return my_string.split(" ");
	}

}
