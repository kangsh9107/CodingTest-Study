package programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeHamberger {

	//프로그래머스 Level 1. 햄버거 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/133502
	public static void main(String[] args) {
		MakeHamberger mhb = new MakeHamberger();
		
//		int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
//		System.out.println(mhb.solution(ingredient1));
		
		int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
		System.out.println(mhb.solution(ingredient2));
	}
	
	static List<Integer> list = null;
	static int answer = 0;
    static int index = 0;
    
    public int solution(int[] ingredient) {
		Integer[] temp = new Integer[ingredient.length];
		for(int i=0; i<ingredient.length; i++) {
			temp[i] = ingredient[i];
		}
		
		list = new ArrayList<>(Arrays.asList(temp));
		
		for(int i=0; i<ingredient.length; i++) {
			remover(list);
		}
		
        return answer;
    }
	
	public static void remover(List<Integer> list) {
        if(index-2 < 0) index = 0;
        
		for(int i=index; i<list.size(); i++) {
			if(list.get(i) == 1 && i <= list.size()-4) {
				if(list.get(i+1) == 2 && list.get(i+2) == 3 && list.get(i+3) == 1) {
                    index = i - 2;
					answer++;
					
					for(int j=i; j<i+4; j++) {
						list.remove(i);
					}
					
					break;
				}
			}
		}
	}

}
