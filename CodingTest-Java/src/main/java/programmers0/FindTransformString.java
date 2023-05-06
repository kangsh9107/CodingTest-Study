package programmers0;

public class FindTransformString {

	//프로그래머스 Level 0. 문자열 바꿔서 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181864
	public static void main(String[] args) {
		FindTransformString fts = new FindTransformString();
		
		String myString1 = "ABBAA";
		String pat1 = "AABB";
		System.out.println(fts.solution(myString1, pat1));
		
//		String myString2 = "ABAB";
//		String pat2 = "ABAB";
//		System.out.println(fts.solution(myString2, pat2));
	}

	private int solution(String myString, String pat) {
		StringBuilder sb = new StringBuilder();
		String[] temp = pat.split("");
		for(int i=0; i<temp.length; i++) {
			if(temp[i].equals("A")) sb.append("B");
			else sb.append("A");
		}
		return myString.contains(sb.toString()) ? 1 : 0;
	}

}
