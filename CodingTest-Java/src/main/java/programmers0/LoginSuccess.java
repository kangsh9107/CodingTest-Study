package programmers0;

import java.util.HashMap;
import java.util.Map;

public class LoginSuccess {

	//프로그래머스 Level 0. 로그인 성공?
	//https://school.programmers.co.kr/learn/courses/30/lessons/120883
	public static void main(String[] args) {
		LoginSuccess ls = new LoginSuccess();
		
		String[] id_pw1 = {"meosseugi", "1234"};
		String[][] db1 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		System.out.println(ls.solution(id_pw1, db1));
		
		String[] id_pw2 = {"programmer01", "15789"};
		String[][] db2 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
		System.out.println(ls.solution(id_pw2, db2));
		
		String[] id_pw3 = {"rabbit04", "98761"};
		String[][] db3 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
		System.out.println(ls.solution(id_pw3, db3));
	}

	private String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        Map<String, String> idpw = new HashMap<>();
        for(int i=0; i<db.length; i++) {
            idpw.put(db[i][0], db[i][1]);
        }
        for(int i=0; i<idpw.size(); i++) {
            try {
                if(idpw.get(id_pw[0]).equals(id_pw[1])) answer = "login";
                else if( !idpw.get(id_pw[0]).equals(id_pw[1]) ) answer = "wrong pw";
            } catch(Exception e) {
                
            }
        }
        return answer;
	}

}
