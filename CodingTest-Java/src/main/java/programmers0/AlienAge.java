package programmers0;

public class AlienAge {

	//프로그래머스 Level 0. 외계행성의 나이
	//https://school.programmers.co.kr/learn/courses/30/lessons/120834
	public static void main(String[] args) {
		AlienAge aa = new AlienAge();
		
		int age1 = 23;
		System.out.println(aa.solution(age1));
		
//		int age2 = 51;
//		System.out.println(aa.solution(age2));
//		
//		int age3 = 100;
//		System.out.println(aa.solution(age3));
	}
	
    public String solution(int age) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j"};
        StringBuilder convert = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        convert.append(age);
        for(int i=0; i<convert.length(); i++) {
            answer.append(alphabet[Integer.parseInt(convert.substring(i, i+1))]);
        }
        return answer.toString();
    }

}
