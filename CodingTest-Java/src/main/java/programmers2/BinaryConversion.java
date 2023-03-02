package programmers2;

public class BinaryConversion {

	//프로그래머스 Level 2. 이진 변환 반복
	//https://school.programmers.co.kr/learn/courses/30/lessons/70129
	public static void main(String[] args) {
		BinaryConversion bc = new BinaryConversion();
		
		String s1 = "110010101001";
		System.out.println(bc.solution(s1));
		
//		String s2 = "01110";
//		System.out.println(bc.solution(s2));
//		
//		String s3 = "1111111";
//		System.out.println(bc.solution(s3));
	}
	
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cntZero = 0;
        int cntOne = 0;
        
        while( !s.equals("1") ) {
        	for(int i=0; i<s.length(); i++) {
        		if(s.substring(i, i+1).equals("0")) cntZero++;
        		else                                cntOne++;
        	}
        	answer[0]++;
        	answer[1] += cntZero;
        	s = Integer.toBinaryString(cntOne);
        	
        	cntZero = 0;
        	cntOne = 0;
        }
        
        return answer;
    }

}
