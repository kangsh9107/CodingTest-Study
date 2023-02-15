package programmers0;

public class HiddenNumberPlus {

	//프로그래머스 Level 0. 숨어있는 숫자의 덧셈 (2)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120864
	public static void main(String[] args) {
		HiddenNumberPlus hnp = new HiddenNumberPlus();
		
		String my_string1 = "aAb1B2cC34oOp";
		System.out.println(hnp.solution(my_string1));
		
//		String my_string2 = "1a2b3c4d123Z";
//		System.out.println(hnp.solution(my_string2));
	}
	
    public int solution(String my_string) {
        int answer = 0;
        String[] numbers = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]", " ").split(" ");
        for(String n : numbers) {
        	if( !n.equals("") ) answer += Integer.parseInt(n.trim());
        }
        return answer;
    }

}
