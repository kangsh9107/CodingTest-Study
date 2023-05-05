package programmers0;

import java.util.ArrayList;
import java.util.List;

public class ThreeSeparator {

	//프로그래머스 Level 0. 세 개의 구분자
	//https://school.programmers.co.kr/learn/courses/30/lessons/181862
	public static void main(String[] args) {
		ThreeSeparator ts = new ThreeSeparator();
		
		String myStr1 = "baconlettucetomato";
		System.out.println(ts.solution(myStr1));
		
//		String myStr2 = "abcd";
//		System.out.println(ts.solution(myStr2));
//		
//		String myStr3 = "cabab";
//		System.out.println(ts.solution(myStr3));
	}
	
    private List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();
        String[] temp = myStr.split("[abc]");
        for(int i=0; i<temp.length; i++) {
            if( !temp[i].equals("") ) answer.add(temp[i]);
        }
        if(answer.size() == 0) answer.add("EMPTY");
        return answer;
    }

}
