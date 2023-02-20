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
        		System.out.println("sp : " + sp);
        	}
        }
        return answer;
    }
    
}
