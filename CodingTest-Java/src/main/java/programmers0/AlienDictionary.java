package programmers0;

public class AlienDictionary {

	//프로그래머스 Level 0. 외계어 사전
	//https://school.programmers.co.kr/learn/courses/30/lessons/120869
	public static void main(String[] args) {
		AlienDictionary ad = new AlienDictionary();
		
		String[] spell1 = {"p", "o", "s"};
		String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
		System.out.println(ad.solution(spell1, dic1));
		
		String[] spell2 = {"z", "d", "x"};
		String[] dic2 = {"def", "dww", "dzx", "loveaw"};
		System.out.println(ad.solution(spell2, dic2));
		
		String[] spell3 = {"s", "o", "m", "d"};
		String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
		System.out.println(ad.solution(spell3, dic3));
	}

	private int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cnt = 0;
        for(int i=0; i<dic.length; i++) {
            cnt = 0;
            for(int j=0; j<spell.length; j++) {
                if(dic[i].length() - dic[i].replaceAll(spell[j], "").length() == 1) cnt++;
            }
            if(cnt == spell.length) return 1;
        }
        return answer;
	}

}
