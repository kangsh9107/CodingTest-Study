package programmers1;

public class Keyboard {

	//프로그래머스 Level 1. 대충 만든 자판
	//https://school.programmers.co.kr/learn/courses/30/lessons/160586
	public static void main(String[] args) {
		Keyboard kb = new Keyboard();
		
		String[] keymap1 = {"ABACD", "BCEFD"};
		String[] targets1 = {"ABCD","AABB"};
		System.out.println(kb.solution(keymap1, targets1));
		
//		String[] keymap2 = {"AA"};
//		String[] targets2 = {"B"};
//		System.out.println(kb.solution(keymap2, targets2));
//		
//		String[] keymap3 = {"AGZ", "BSSS"};
//		String[] targets3 = {"ASA","BGZ"};
//		System.out.println(kb.solution(keymap3, targets3));
	}
	
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		int cnt = 101;
		for(int i=0; i<targets.length; i++) {
			for(int j=0; j<targets[i].length(); j++) {
				
				cnt = 101;
				for(int k=0; k<keymap.length; k++) {
					if(keymap[k].contains(targets[i].substring(j, j + 1)) &&
					   cnt > keymap[k].indexOf(targets[i].substring(j, j + 1)) + 1) {
						cnt = keymap[k].indexOf(targets[i].substring(j, j + 1)) + 1;
					}
				}
				if(cnt == 101) {
					answer[i] = -1;
					break;
				} else {
					answer[i] += cnt;
				}
			}
		}
		
		return answer;
	}

}
