package programmers0;

import java.util.ArrayList;
import java.util.List;

public class DeleteElement {

	//프로그래머스 Level 0. 배열의 원소 삭제하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181844
	public static void main(String[] args) {
		DeleteElement de = new DeleteElement();
		
		int[] arr1 = {293, 1000, 395, 678, 94};
		int[] delete_list1 = {94, 777, 104, 1000, 1, 12};
		System.out.println(de.solution(arr1, delete_list1));
		
//		int[] arr2 = {110, 66, 439, 785, 1};
//		int[] delete_list2 = {377, 823, 119, 43};
//		System.out.println(de.solution(arr2, delete_list2));
	}

	private List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            list1.add(arr[i]);
        }
        for(int i=0; i<delete_list.length; i++) {
            list2.add(delete_list[i]);
        }
        list1.removeAll(list2);
        return list1;
	}

}
