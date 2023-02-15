package programmers0;

public class FindNumber {

	//프로그래머스 Level 0. 숫자 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120904
	public static void main(String[] args) {
		FindNumber fn = new FindNumber();
		
		int num1 = 29183;
		int k1 = 1;
		System.out.println(fn.solution(num1, k1));
		
		int num2 = 232443;
		int k2 = 4;
		System.out.println(fn.solution(num2, k2));
		
		int num3 = 123456;
		int k3 = 7;
		System.out.println(fn.solution(num3, k3));
	}
	
	public int solution(int num, int k) {
        int answer = -1;
        StringBuilder sb = new StringBuilder();
        String tempNum = sb.append(num).toString();
        sb.setLength(0);
        String tempK = sb.append(k).toString();
        for(int i=0; i<tempNum.length(); i++) {
            if( !tempK.equals("10") ) {
                if(tempNum.substring(i, i+1).equals(tempK)) {
                	answer = i+1;
                	break;
                }
            } else {
                if(tempNum.substring(i, i+2).equals(tempK)) {
                	answer = i+1;
                	break;
                }
            }
        }
        return answer;
	}

}
