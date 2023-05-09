package programmers0;

public class Babbling1 {

	//프로그래머스 Level 0. 옹알이 (1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120956
	public static void main(String[] args) {
		Babbling1 bb = new Babbling1();
		
		String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(bb.solution(babbling1));
		
		String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		System.out.println(bb.solution(babbling2));
	}

    public int solution(String[] babbling) {
        int answer = 0;
        int cnt = 0;
        String replaceB = "";
        for(int i=0; i<babbling.length; i++) {
        	cnt = 0;
        	replaceB = babbling[i];
        	replaceB = replaceB.replaceAll("aya", " ");
        	replaceB = replaceB.replaceAll("ye", " ");
        	replaceB = replaceB.replaceAll("ma", " ");
        	replaceB = replaceB.replaceAll("woo", " ");
        	for(int j=0; j<replaceB.length(); j++) {
        		if( !replaceB.substring(j, j+1).equals(" ") ) cnt++;
        	}
        	if(cnt == 0) answer++;
        }
        return answer;
    }
    
}
