package programmers0;

public class Morse {

	//프로그래머스 Level 0. 모스부호 (1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120838
	public static void main(String[] args) {
		Morse mo = new Morse();
		
		String letter1 = ".... . .-.. .-.. ---";
		System.out.println(mo.solution(letter1));
		
//		String letter2 = ".--. -.-- - .... --- -.";
//		System.out.println(mo.solution(letter2));
	}
	
    public String solution(String letter) {
    	StringBuilder answer = new StringBuilder();
        String[] morse    = {".-",  "-...", "-.-.",  "-..",    ".", "..-.",  "--.", "....",  "..", ".---",
        					 "-.-", ".-..",   "--",   "-.",  "---", ".--.", "--.-",  ".-.", "...",    "-",
        					 "..-", "...-",  ".--", "-..-", "-.--", "--.."};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        					 "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
        					 "u", "v", "w", "x", "y", "z"};
        String[] splitLetter = letter.split(" ");
        for(String s : splitLetter) {
        	for(int i=0; i<morse.length; i++) {
        		if(s.equals(morse[i])) answer.append(alphabet[i]);
        	}
        }
        return answer.toString();
    }

}
