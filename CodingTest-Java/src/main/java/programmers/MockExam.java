package programmers;

import java.util.ArrayList;
import java.util.List;

public class MockExam {

	//프로그래머스 Level 1. 모의고사
	//https://school.programmers.co.kr/learn/courses/30/lessons/42840
	public static void main(String[] args) {
		MockExam me = new MockExam();
		
		int[] answers1 = {1,2,3,4,5};
		System.out.println(me.solution(answers1));
		
		int[] answers2 = {1,3,2,4,2};
		System.out.println(me.solution(answers2));
	}
	
	public List<Integer> solution(int[] answers) {
		int[] one   = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int[] two   = {2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5};
		int cntOne = 0, cntTwo = 0, cntThree = 0, index = 0;
		for(int i=0; i<answers.length; i++) {
			if(index == 40) index = 0;
			if(answers[i] == one[index]) cntOne++;
			if(answers[i] == two[index]) cntTwo++;
			if(answers[i] == three[index]) cntThree++;
			index++;
		}
		List<Integer> answer = new ArrayList<>();
		if(cntOne == cntTwo && cntOne == cntThree) {
			answer.add(1);
			answer.add(2);
			answer.add(3);
		} else if(cntOne > cntTwo && cntOne > cntThree) {
			answer.add(1);
		} else if(cntTwo > cntOne && cntTwo > cntThree) {
			answer.add(2);
		} else if(cntThree > cntOne && cntThree > cntTwo) {
			answer.add(3);
		} else if(cntOne == cntTwo && cntOne > cntThree) {
			answer.add(1);
			answer.add(2);
		} else if(cntOne == cntThree && cntOne > cntTwo) {
			answer.add(1);
			answer.add(3);
		} else if(cntTwo == cntThree && cntTwo > cntOne) {
			answer.add(2);
			answer.add(3);
		}
		return answer;
	}

}
