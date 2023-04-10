package programmers1;

public class LackOfMoney {

	//프로그래머스 Level 1. 부족한 금액 계산하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/82612
	public static void main(String[] args) {
		LackOfMoney lom = new LackOfMoney();
		
		int price1 = 3;
		int money1 = 20;
		int count1 = 4;
		System.out.println(lom.solution(price1, money1, count1));
	}
	
    public long solution(int price, int money, int count) {
        long answer = 0;
        long price2 = (long)price;
        long money2 = (long)money;
        long count2 = (long)count;
        
        for(int i=1; i<=count2; i++) {
            money2 -= (i * price2);
        }
        if(money2 < 0) answer = Math.abs(money2);

        return answer;
    }

}
