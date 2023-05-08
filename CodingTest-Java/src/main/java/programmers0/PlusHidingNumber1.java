package programmers0;

public class PlusHidingNumber1 {

	//프로그래머스 Level 0. 숨어있는 숫자의 덧셈 (1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120851
	public static void main(String[] args) {
		PlusHidingNumber1 phn = new PlusHidingNumber1();
		
		String my_string1 = "aAb1B2cC34oOp";
		System.out.println(phn.solution(my_string1));
		
//		String my_string2 = "1a2b3c4d123";
//		System.out.println(phn.solution(my_string2));
	}

	private int solution(String my_string) {
        int answer = 0;
        String[] splitMy_string = my_string.split("");
        for(String s : splitMy_string) {
            try {
                answer += Integer.parseInt(s);
            } catch(Exception e) {
                
            }
        }
        return answer;
	}

}
