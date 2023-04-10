package programmers1;

public class Harshad {

	//프로그래머스 Level 1. 하샤드 수
	//https://school.programmers.co.kr/learn/courses/30/lessons/12947
	public static void main(String[] args) {
		Harshad hs = new Harshad();
		
		int arr1 = 10;
		System.out.println(hs.solution(arr1));
		
		int arr2 = 12;
		System.out.println(hs.solution(arr2));
		
		int arr3 = 11;
		System.out.println(hs.solution(arr3));
		
		int arr4 = 13;
		System.out.println(hs.solution(arr4));
	}
	
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] temp = String.valueOf(x).split("");
        int sum = 0;
        for(String t : temp) {
            sum += Integer.parseInt(t);
        }
        
        if(x % sum != 0) answer = false;
        
        return answer;
    }

}
