package programmers0;

import java.util.StringTokenizer;

public class SeparateBySpace2 {

	//프로그래머스 Level 0. 공백으로 구분하기 2
	//https://school.programmers.co.kr/learn/courses/30/lessons/181868
	public static void main(String[] args) {
		SeparateBySpace2 sbs = new SeparateBySpace2();
		
		String my_string1 = " i    love  you";
		System.out.println(sbs.solution(my_string1));
		
		String my_string2 = "   programmers  ";
		System.out.println(sbs.solution(my_string2));
	}

	private String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string.trim());
        String[] answer = new String[st.countTokens()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = st.nextToken();
        }

        return answer;
    }
    
//     public List<String> solution(String my_string) {
//         String[] split = my_string.split(" ");
//         List<String> answer = new ArrayList<>();
//         for(int i=0; i<split.length; i++) {
//             if( !split[i].equals("") ) answer.add(split[i]);
//         }
        
//         return answer;
//     }

}
