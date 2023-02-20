package programmers0;

public class CuresedNumberThree {

	//프로그래머스 Level 0. 저주의 숫자 3
	//https://school.programmers.co.kr/learn/courses/30/lessons/120871
	public static void main(String[] args) {
		CuresedNumberThree cnt = new CuresedNumberThree();
		
		int n1 = 15;
		System.out.println(cnt.solution(n1));
		
//		int n2 = 40;
//		System.out.println(cnt.solution(n2));
	}
	
    public int solution(int n) {
        int answer = 0;
        boolean[] numbers = new boolean[501];
        String checkThree = "";
        for(int i=1; i<=numbers.length; i++) {
            checkThree = Integer.toString(i);
            if(i % 3 != 0 && !checkThree.contains("3")) numbers[i] = true;
        }
        
        int cnt = 0;
        for(int i=1; i<=numbers.length; i++) {
            if(numbers[i]) {
                cnt++;
                if(cnt == n) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }

}
