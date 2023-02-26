package programmers2;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		MaxMin mm = new MaxMin();
		
		String s1 = "1 2 3 4";
		System.out.println(mm.solution(s1));
		
//		String s2 = "-1 -2 -3 -4";
//		System.out.println(mm.solution(s2));
//		
//		String s3 = "-1 -1";
//		System.out.println(mm.solution(s3));
	}
	
    public String solution(String s) {
        String answer = "";
        String[] splitS = s.split(" ");
        int[] sort = new int[splitS.length];
        for(int i=0; i<splitS.length; i++) {
        	sort[i] = Integer.parseInt(splitS[i]);
        }
        Arrays.sort(sort);
        answer = sort[0] + " " + sort[sort.length-1];
        
        return answer;
    }

}
