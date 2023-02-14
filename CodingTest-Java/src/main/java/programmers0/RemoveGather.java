package programmers0;

public class RemoveGather {

	//프로그래머스 Level 0. 모음 제거
	//https://school.programmers.co.kr/learn/courses/30/lessons/120849
	public static void main(String[] args) {
		RemoveGather rg = new RemoveGather();
		
		String my_string1 = "bus";
		System.out.println(rg.solution(my_string1));
		
		String my_string2 = "nice to meet you";
		System.out.println(rg.solution(my_string2));
	}
	
	public String solution(String my_string) {
		my_string = my_string.replaceAll("a", "");
		my_string = my_string.replaceAll("e", "");
		my_string = my_string.replaceAll("i", "");
		my_string = my_string.replaceAll("o", "");
		my_string = my_string.replaceAll("u", "");
		return my_string;
	}

}
