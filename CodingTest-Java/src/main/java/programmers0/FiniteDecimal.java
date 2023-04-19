package programmers0;

public class FiniteDecimal {

	//프로그래머스 Level 0. 유한소수 판별하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120878
	public static void main(String[] args) {
		FiniteDecimal fd = new FiniteDecimal();
		
		int a1 = 7;
		int b1 = 20;
		System.out.println(fd.solution(a1, b1));
		
//		int a2 = 11;
//		int b2 = 22;
//		System.out.println(fd.solution(a2, b2));
//		
//		int a3 = 12;
//		int b3 = 21;
//		System.out.println(fd.solution(a3, b3));
	}
	
    public int solution(int a, int b) {
        int d = b / gcd(a, b);
        
        //분모의 소인수가 2, 5만 있어야 한다.
        //2와 5로 계속 나눠서 1이되면 소인수가 2, 5만 있는 거다.
        while(d != 1) {
        	if(d % 2 == 0) d /= 2;
        	else if(d % 5 == 0) d /=5;
        	else return 2;
        }
        
        return 1;
    }
    
    public static int gcd(int a, int b) {
    	if(b == 0) return a;
    	return gcd(b, a % b);
    }
    
//    public static int lcm(int a, int b) {
//    	return a * b / gcd(a, b);
//    }

}
