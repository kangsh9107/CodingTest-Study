package programmers1;

public class HidePhoneNumber {

	//프로그래머스 Level 1. 핸드폰 번호 가리기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12948
	public static void main(String[] args) {
		HidePhoneNumber hpn = new HidePhoneNumber();
		
		String phone_number1 = "01033334444";
		System.out.println(hpn.solution(phone_number1));
		
		String phone_number2 = "027778888";
		System.out.println(hpn.solution(phone_number2));
	}

    public String solution(String phone_number) {
        String answer = "";
        
        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        
        return answer;
    }
	
}
