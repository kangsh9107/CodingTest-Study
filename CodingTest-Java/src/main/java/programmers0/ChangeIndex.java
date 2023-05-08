package programmers0;

public class ChangeIndex {

	//프로그래머스 Level 0. 인덱스 바꾸기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120895
	public static void main(String[] args) {
		ChangeIndex ci = new ChangeIndex();
		
		String my_string1 = "hello";
		int num1 = 1;
		int num2 = 2;
		System.out.println(ci.solution(my_string1, num1, num2));
		
		String my_string2 = "I love you";
		int num3 = 3;
		int num4 = 6;
		System.out.println(ci.solution(my_string2, num3, num4));
	}

	private String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        String[] spiltMy_string = my_string.split("");
        String temp = spiltMy_string[num1];
        spiltMy_string[num1] = spiltMy_string[num2];
        spiltMy_string[num2] = temp;
        for(String s : spiltMy_string) {
            answer.append(s);
        }
        return answer.toString();
	}

}
