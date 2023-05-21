package programmers0;

import java.util.ArrayList;
import java.util.List;

public class LeftRight {

	//프로그래머스 Level 0. 왼쪽 오른쪽
	//https://school.programmers.co.kr/learn/courses/30/lessons/181890
	public static void main(String[] args) {
		LeftRight lr = new LeftRight();
		
//		String[] str_list1 = {"u", "u", "l", "r"};
//		System.out.println(lr.solution(str_list1));
		
		String[] str_list2 = {"l"};
		System.out.println(lr.solution(str_list2));
	}

	private List<String> solution(String[] str_list) {
		List<String> answer = new ArrayList<>();
		String dir = "";
		int idx = 0;
		for (int i=0; i<str_list.length; i++) {
			if(str_list[i].equals("l")) {
				dir = "l";
				idx = i;
				break;
			} else if (str_list[i].equals("r")) {
				dir = "r";
				idx = i;
				break;
			}
		}
		
		if (str_list.length == 0) {
			
		} else if (dir.equals("l")) {
			for (int i=0; i<idx; i++) {
				answer.add(str_list[i]);
			}
		} else {
			for (int i=idx+1; i<str_list.length; i++) {
				answer.add(str_list[i]);
			}
		}
		
		return answer;
	}

}
