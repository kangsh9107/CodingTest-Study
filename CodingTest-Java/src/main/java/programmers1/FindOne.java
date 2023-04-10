package programmers1;

public class FindOne {

	//프로그래머스 Level 1. 나머지가 1이 되는 수 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/87389
	public static void main(String[] args) {
		FindOne fo = new FindOne();
		
		int n1 = 10;
		System.out.println(fo.solution(n1));
		
		int n2 = 12;
		System.out.println(fo.solution(n2));
	}
	
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }

}
