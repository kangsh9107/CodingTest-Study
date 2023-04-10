package programmers1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HateSameNumber {

	//프로그래머스 Level 1. 같은 숫자는 싫어
	//https://school.programmers.co.kr/learn/courses/30/lessons/12906
	public static void main(String[] args) {
		HateSameNumber hsn = new HateSameNumber();
		
		int[] arr1 = {1,1,3,3,0,1,1};
		System.out.println(hsn.solution(arr1));
		
		int[] arr2 = {4,4,4,3,3};
		System.out.println(hsn.solution(arr2));
	}
	
    static int index = 0;
    public List<Integer> solution(int []arr) {
		HashSet<Integer> hs = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(hs.add(arr[i])) {
				list.add(arr[i]);
			} else {
				if(list.size() > 0) {
					if(list.get(list.size()-1) != arr[i]) {
						list.add(arr[i]);
					}
				}
			}
		}
        
        return list;
    }

}
