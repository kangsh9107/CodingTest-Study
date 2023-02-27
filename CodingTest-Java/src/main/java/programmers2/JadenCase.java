package programmers2;

public class JadenCase {

	public static void main(String[] args) {
		JadenCase jc = new JadenCase();
		
		String s1 = "3people unFollowed me";
		System.out.println(jc.solution(s1));
		
//		String s2 = "for the last week";
//		System.out.println(jc.solution(s2));
	}
	
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] splitS = s.split(" ");
        for(int i=0; i<splitS.length; i++) {
            for(int j=0; j<splitS[i].length(); j++) {
                if(j == 0) {
                    try {
                        answer.append(splitS[i].substring(j, j+1).toUpperCase());
                    } catch(Exception e) {
                        answer.append(splitS[i].substring(j, j+1));
                    }
                } else {
                    answer.append(splitS[i].substring(j, j+1).toLowerCase());
                }
            }
            if(i < splitS.length - 1) answer.append(" ");
        }
        return answer.toString();
    }

}
