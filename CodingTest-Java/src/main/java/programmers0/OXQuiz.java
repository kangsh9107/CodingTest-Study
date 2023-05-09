package programmers0;

public class OXQuiz {

	//프로그래머스 Level 0. OX퀴즈
	//https://school.programmers.co.kr/learn/courses/30/lessons/120907
	public static void main(String[] args) {
		OXQuiz oxq = new OXQuiz();
		
		String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
		System.out.println(oxq.solution(quiz1));
		
//		String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
//		System.out.println(oxq.solution(quiz2));
	}
	
	public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int sum = 0;
        for(int i=0; i<quiz.length; i++) {
            String[] splitQ = quiz[i].split(" ");
            if(splitQ[1].equals("+")) sum = Integer.parseInt(splitQ[0]) + Integer.parseInt(splitQ[2]);
            else sum = Integer.parseInt(splitQ[0]) - Integer.parseInt(splitQ[2]);
            
            if(sum == Integer.parseInt(splitQ[4])) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
	}

}
