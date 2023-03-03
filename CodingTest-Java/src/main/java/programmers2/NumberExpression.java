package programmers2;

public class NumberExpression {

	//프로그래머스 Level 2. 숫자의 표현
	//https://school.programmers.co.kr/learn/courses/30/lessons/12924
	public static void main(String[] args) {
		NumberExpression ne = new NumberExpression();
		
		int n1 = 15;
		System.out.println(ne.solution(n1));
	}

    public int solution(int num) {
        int answer = 0;
        boolean[] visited = new boolean[(num/1) + 1];
        int[] arr = new int[(num/1) + 1];
        for(int i=0; i<arr.length; i++) {
        	arr[i] = i + 1;
        }
        
        for(int i=1; i<=arr.length; i++) {
        	combination(arr, visited, 0, arr.length, i);
        }
        
        
        
        return answer;
    }
    
    public void combination(int[] arr, boolean[] visited, int start, int n, int r) {
    	if(r == 0) {
    		check(arr, visited, n);
    		return;
    	}
    	
    	for(int i=start; i<r; i++) {
    		visited[i] = true;
    		combination(arr, visited, i+1, n, r-1);
    		visited[i] = false;
    	}
    }
    
    public void check(int[] arr, boolean[] visited, int n) {
    	int sum = 0;
    	for(int i=0; i<n; i++) {
    		if(visited[i]) sum += arr[i];
    	}
    	if(sum == num) answer++;
    }
    
}
