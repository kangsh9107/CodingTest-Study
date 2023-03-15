package programmers1;

public class RecommendNewId {

	//프로그래머스 Level 1. 신규 아이디 추천
	//https://school.programmers.co.kr/learn/courses/30/lessons/72410
	public static void main(String[] args) {
		RecommendNewId rni = new RecommendNewId();
		
		String new_id1 = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(rni.solution(new_id1));
		
//		String new_id2 = "z-+.^.";
//		System.out.println(rni.solution(new_id2));
//		
//		String new_id3 = "=.=";
//		System.out.println(rni.solution(new_id3));
//		
//		String new_id4 = "123_.def";
//		System.out.println(rni.solution(new_id4));
//		
//		String new_id5 = "abcdefghijklmn.p";
//		System.out.println(rni.solution(new_id5));
	}
	
	public String solution(String new_id) {
		StringBuilder answer = new StringBuilder();
		//1단계
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String reg = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
		String temp = "";
		String[] id = new_id.split("");
		for(int i=0; i<id.length; i++) {
			if(capital.contains(id[i])) id[i] = id[i].toLowerCase(); 
		}
		//2단계
		for(int i=0; i<id.length; i++) {
			if(reg.contains(id[i])) answer.append(id[i]);
		}
		//3단계
		id = answer.toString().split("");
		answer.setLength(0);;
		answer.append(id[0]);
		for(int i=1; i<id.length; i++) {
			if(id[i - 1].equals(".") && id[i].equals(".")) continue;
			else answer.append(id[i]);
		}
		//4단계
		if(answer.length() == 1 && answer.toString().equals(".")) {
			answer.setLength(0);
		} else if(answer.length() == 2) {
			if(answer.toString().equals("..")) {
				answer.setLength(0);
			} else if(answer.toString().substring(0, 1).equals(".")) {
				temp = answer.toString().substring(1);
				answer.setLength(0);
				answer.append(temp);
			} else if(answer.toString().substring(1).equals(".")) {
				temp = answer.toString().substring(0, 1);
				answer.setLength(0);
				answer.append(temp);
			}
		} else {
			if(answer.toString().substring(0, 1).equals(".") && answer.toString().substring(answer.length() - 1).equals(".")) {
				temp = answer.toString().substring(1);
				temp = temp.substring(0, temp.length() - 1);
				answer.setLength(0);
				answer.append(temp);
			} else if(answer.toString().substring(0, 1).equals(".")) {
				temp = answer.toString().substring(1);
				answer.setLength(0);
				answer.append(temp);
			} else if(answer.toString().substring(answer.length() - 1).equals(".")) {
				temp = answer.toString().substring(0, answer.length() - 1);
				answer.setLength(0);
				answer.append(temp);
			}
		}
		//5단계
		if(answer.length() == 0) answer.append("a");
		//6단계
		if(answer.length() > 15) {
			temp = answer.toString().substring(0, 15);
			answer.setLength(0);
			answer.append(temp);
			if(answer.toString().substring(14).equals(".")) {
				temp = answer.toString().substring(0, 14);
				answer.setLength(0);
				answer.append(temp);
			}
		}
		//7단계
		if(answer.length() == 2) {
			temp = answer.toString().substring(answer.length() - 1);
			answer.append(temp);
		} else if(answer.length() == 1) {
			temp = answer.toString();
			answer.append(temp);
			answer.append(temp);
		}
		
		return answer.toString();
	}

}
