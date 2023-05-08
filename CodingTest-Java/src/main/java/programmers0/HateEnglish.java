package programmers0;

public class HateEnglish {

	//프로그래머스 Level 0. 영어가 싫어요
	//https://school.programmers.co.kr/learn/courses/30/lessons/120894
	public static void main(String[] args) {
		HateEnglish he = new HateEnglish();
		
		String numbers1 = "onetwothreefourfivesixseveneightnine";
		System.out.println(he.solution(numbers1));
		
		String numbers2 = "onefourzerosixseven";
		System.out.println(he.solution(numbers2));
	}

	private long solution(String numbers) {
        String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i=0; i<10; i++) {
        	numbers = numbers.replaceAll(alphabet[i], num[i]);
        }
        return Long.parseLong(numbers);
	}

}
