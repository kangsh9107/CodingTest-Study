package programmers0;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

	//프로그래머스 Level 0. 할 일 목록
	//https://school.programmers.co.kr/learn/courses/30/lessons/181885
	public static void main(String[] args) {
		TodoList tl = new TodoList();
		
		String[] todo_list1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished1 = {true, false, true, false};
		System.out.println(tl.solution(todo_list1, finished1));
	}

	private List<String> solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++) {
            if( !finished[i] ) answer.add(todo_list[i]);
        }
        
        return answer;
	}

}
