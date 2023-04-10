package programmers1;

public class Babbling {
	
	//프로그래머스 Level 1. 옹알이 (2)
	//https://school.programmers.co.kr/learn/courses/30/lessons/133499
	public static void main(String[] args) {
//		String[] babbling = {"aya", "yee", "u", "maa"};
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		int answer = 0;
		
        for (String str : babbling) {
            if (str.contains("woowoo") || str.contains("ayaaya") || str.contains("mama") || str.contains("yeye"))
                continue;

            str = str.replace("woo", " ");
            str = str.replace("aya", " ");
            str = str.replace("ye", " ");
            str = str.replace("ma", " ");
            str = str.replace(" ", "");

            if (str.equals("")) {
                answer++;
            }
        }
		
		System.out.println(answer);
	}

}
