package programmers0;

public class PlusPolynomial {

	//프로그래머스 Level 0. 다항식 더하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120863
	public static void main(String[] args) {
		PlusPolynomial pp = new PlusPolynomial();
		
		String polynomial1 = "3x + 7 + x";
		System.out.println(pp.solution(polynomial1));
		
//		String polynomial2 = "x + x + x";
//		System.out.println(pp.solution(polynomial2));
	}

    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        int x = 0;
        String[] splitP = polynomial.split(" ");
        for(String sp : splitP) {
        	if( !sp.equals("+") ) {
        		try {
        			num += Integer.parseInt(sp);
        		} catch(Exception e) {
        			if(sp.equals("x")) x++;
        			else x += Integer.parseInt(sp.substring(0, sp.length()-1));
        		}
        	}
        }
        
        if(x == 0 && num != 0) {
        	answer = Integer.toString(num);
        } else if(x != 0 && num == 0) {
        	if(x == 1) answer = "x";
        	else       answer = x + "x";
        } else if(x != 0 && num != 0) {
        	if(x == 1) answer = "x + " + num;
        	else       answer = x + "x + " + num;
        }
        return answer;
    }
    
}
