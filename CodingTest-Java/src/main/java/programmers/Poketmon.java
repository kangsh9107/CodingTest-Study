package programmers;

import java.util.HashSet;
import java.util.Set;

public class Poketmon {

	public static void main(String[] args) {
		Poketmon pm = new Poketmon();
		
//		int[] nums1 = {3,1,2,3};
//		System.out.println(pm.solution(nums1));
//		
//		int[] nums2 = {3,3,3,2,2,4};
//		System.out.println(pm.solution(nums2));
		
		int[] nums3 = {3,3,3,2,2,2};
		System.out.println(pm.solution(nums3));
	}
	
	static int answer = 0;
	public int solution(int[] nums) {
		int n = nums.length;
		int r = n / 2;
		boolean[] visited = new boolean[n];
		combination(nums, visited, 0, n, r);
		
		/*
		int n = nums.length;
        int r = n / 2;
        
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> values = new ArrayList<>(frequency.values());
        Collections.sort(values, Collections.reverseOrder());
        
        int answer = Math.min(r, values.size());
        for (int i = answer; i < values.size(); i++) {
            if (values.get(i) * 2 <= n) {
                answer = i;
                break;
            }
        }
        return answer;
		 */
		return answer;
	}
	public static void combination(int[] nums, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			max(nums, visited, n);
			return;
		}
		for(int i=start; i<n; i++) {
			if(answer == n) break;
			visited[i] = true;
			combination(nums, visited, i+1, n, r-1);
			visited[i] = false;
		}
	}
	public static void max(int[] nums, boolean[] visited, int n) {
		Set<Integer> hs = new HashSet<>();
		for(int i=0; i<n; i++) {
			if(visited[i]) hs.add(nums[i]);
		}
		if(hs.size() > answer) answer = hs.size();
	}

}
