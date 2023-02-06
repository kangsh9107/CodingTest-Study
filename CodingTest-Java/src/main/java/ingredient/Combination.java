package ingredient;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	
	static int cnt = 0;

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int n = 3;
		int r = 2;
		boolean[] visited = new boolean[n];
		combination(arr, visited, 0, n, r);
		System.out.println(cnt);
	}
	
	public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			print(arr, visited, n);
			cnt++;
			return;
		}
		
		for(int i=start; i<n; i++) {
			visited[i] = true;
			combination(arr, visited, i+1, n, r-1);
			visited[i] = false;
		}
	}
	
	public static void print(int[] arr, boolean[] visited, int n) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			if(visited[i]) {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}

}
