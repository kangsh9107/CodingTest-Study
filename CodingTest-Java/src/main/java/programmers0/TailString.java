package programmers0;

public class TailString {

	//프로그래머스 Level 0. 꼬리 문자열
	//https://school.programmers.co.kr/learn/courses/30/lessons/181841
	public static void main(String[] args) {
		TailString ts = new TailString();
		
		String[] str_list1 = {"abc", "def", "ghi"};
		String ex1 = "ef";
		System.out.println(ts.solution(str_list1, ex1));
		
//		String[] str_list2 = {"abc", "bbc", "cbc"};
//		String ex2 = "c";
//		System.out.println(ts.solution(str_list2, ex2));
	}

	private String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<str_list.length; i++) {
            if( !str_list[i].contains(ex) ) answer.append(str_list[i]);
        }
        
        return answer.toString();
	}

}
