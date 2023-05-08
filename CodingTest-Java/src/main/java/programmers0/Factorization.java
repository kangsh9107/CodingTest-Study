package programmers0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Factorization {

	//프로그래머스 Level 0. 소인수분해
	//https://school.programmers.co.kr/learn/courses/30/lessons/120852
	public static void main(String[] args) {
		Factorization f = new Factorization();
		
		int n1 = 12;
		System.out.println(f.solution(n1));
		
		int n2 = 17;
		System.out.println(f.solution(n2));
		
		int n3 = 420;
		System.out.println(f.solution(n3));
	}

	private List<Integer> solution(int n) {
        //에라토스테네스의 체 알고리즘으로 소수 찾기
        boolean[] prime = new boolean[n+1];
        for(int i=2; i*i<=n; i++) {
            if( !prime[i] ) {                //prime[i]가 소수라면 (소수는 false)
                for(int j=i*i; j<=n; j+=i) { //prime[j]는 소수가 아니다
                    prime[j] = true;
                }
            }
        }
        
        Set<Integer> factors = new HashSet<>(); //문제에서 요구하는 소인수는 중복을 포함하지 않는다
        int num = n;
        for(int i=2; i<=n; i++) {
            if( !prime[i] ) {
                while(num % i == 0) {
                    factors.add(i);
                    num /=i;
                }
            }
        }
        
        List<Integer> answer = new ArrayList<>(factors); //오름차순 정렬
        Collections.sort(answer);
        return answer;
	}

}
