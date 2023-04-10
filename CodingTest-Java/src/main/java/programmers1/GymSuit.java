package programmers1;

public class GymSuit {

	//프로그래머스 Level 1. 체육복
	//https://school.programmers.co.kr/learn/courses/30/lessons/42862
	public static void main(String[] args) {
		GymSuit gs = new GymSuit();
		
		int n1 = 5;
		int[] lost1 = {2,4};
		int[] reserve1 = {1,3,5};
		System.out.println(gs.solution(n1, lost1, reserve1));
		
		int n2 = 5;
		int[] lost2 = {2,4};
		int[] reserve2 = {3};
		System.out.println(gs.solution(n2, lost2, reserve2));
		
		int n3 = 3;
		int[] lost3 = {3};
		int[] reserve3 = {1};
		System.out.println(gs.solution(n3, lost3, reserve3));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		int[] student = new int[n];
		for(int i=0; i<n; i++) {              //학생들은 체육복이 1벌씩 있다.
			student[i] = 1;
		}
		for(int i=0; i<reserve.length; i++) { //여벌이 있으면 체육복이 2벌씩 있다.
			student[reserve[i] - 1] = 2;
		}
		for(int i=0; i<lost.length; i++) {    //잃어버리면 체육복 1벌만 잃어 버린다. 즉, 여벌이 있는 학생이 잃어버리면 1벌이 남는다.
			student[lost[i] - 1]--;
		}
		
		for(int i=0; i<n; i++) {
			if(student[i] == 0) {   //해당 학생이 체육복이 없는 경우 아래 로직 실행.
				if(i > 0 && student[i-1] == 2) {          //왼쪽에서 오른쪽으로 빌려주는 경우라서 첫번째 학생 제외
					student[i]++;   //왼쪽에 있는 학생에게 빌림.
					student[i-1]--; //왼쪽에 있는 학생이 오른쪽에 있는 학생에게 빌려줌.
				} else if(i < n-1 && student[i+1] == 2) { //오른쪽에서 왼쪽으로 빌려주는 경우라서 마지막 학생 제외
					student[i]++;   //오른쪽에 있는 학생에게 빌림.
					student[i+1]--; //오른쪽에 있는 학생이 왼쪽에 있는 학생에게 빌려줌.
				} else {            //해당 학생이 체육복이 없고, 빌릴 수도 없을 경우.
					answer--;
				}
			}
		}
		
		return answer;
	}

}
