package programmers0;

public class CoffeeErrands {

	//프로그래머스 Level 0. 커피 심부름
	//https://school.programmers.co.kr/learn/courses/30/lessons/181837
	public static void main(String[] args) {
		CoffeeErrands ce = new CoffeeErrands();
		
		String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		System.out.println(ce.solution(order1));
		
//		String[] order2 = {"americanoice", "americano", "iceamericano"};
//		System.out.println(ce.solution(order2));
	}

	private int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length; i++) {
            if(order[i].contains("americano")) {
                answer += 4500;
            } else if(order[i].contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        
        return answer;
	}

}
