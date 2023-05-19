package programmers0;

import java.util.ArrayList;
import java.util.List;

public class FivePeople {

	//프로그래머스 Level 0. 5명씩
	//https://school.programmers.co.kr/learn/courses/30/lessons/181886
	public static void main(String[] args) {
		FivePeople fp = new FivePeople();
		
		String[] names1 = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		System.out.println(fp.solution(names1));
	}

	private List<String> solution(String[] names) {
		List<String> answer = new ArrayList<>();
		for (int i=0; i<names.length; i++) {
			if (i % 5 == 0) {
				answer.add(names[i]);
			} else {
				continue;
			}
		}
		
		return answer;
	}

}
