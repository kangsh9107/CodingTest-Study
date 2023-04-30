package programmers0;

public class CompareDates {

	//프로그래머스 Level 0. 날짜 비교하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181838
	public static void main(String[] args) {
		CompareDates cd = new CompareDates();
		
		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		System.out.println(cd.solution(date1, date2));
		
//		int[] date3 = {1024, 10, 24};
//		int[] date4 = {1024, 10, 24};
//		System.out.println(cd.solution(date3, date4));
		
		int[] date5 = {2023, 3, 24};
		int[] date6 = {2020, 10, 24};
		System.out.println(cd.solution(date5, date6));
	}

	private int solution(int[] date1, int[] date2) {
		String temp1 = "";
		String temp2 = "";
		for(int i=0; i<date1.length; i++) {
			if(date1[i] < 10) temp1 += "0" + date1[i];
			else temp1 += date1[i];
			
			if(date2[i] < 10) temp2 += "0" + date2[i];
			else temp2 += date2[i];
		}
		
        return Integer.parseInt(temp1) < Integer.parseInt(temp2) ? 1 : 0;
	}

}
