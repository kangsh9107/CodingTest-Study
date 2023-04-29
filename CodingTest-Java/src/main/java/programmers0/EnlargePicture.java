package programmers0;

public class EnlargePicture {

	//프로그래머스 Level 0. 그림 확대
	//https://school.programmers.co.kr/learn/courses/30/lessons/181836
	public static void main(String[] args) {
		EnlargePicture ep = new EnlargePicture();
		
		String[] picture1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		int k1 = 2;
		System.out.println(ep.solution(picture1, k1));
		
//		String[] picture2 = {"x.x", ".x.", "x.x"};
//		int k2 = 3;
//		System.out.println(ep.solution(picture2, k2));
	}

	private String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length];
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<answer.length; i++) {
			sb.setLength(0);
			String[] temp = picture[i].split("");
			for(int j=0; j<temp.length; j++) {
				for(int m=0; m<k; m++) {
					sb.append(temp[j]);
				}
			}
			answer[i] = sb.toString();
		}

		String[] answer2 = new String[answer.length * k];
		for(int i=0; i<answer2.length; i++) {
			answer2[i] = answer[i / k];
		}
		
		return answer2;
	}

}
