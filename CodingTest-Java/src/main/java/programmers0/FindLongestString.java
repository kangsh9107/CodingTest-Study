package programmers0;

public class FindLongestString {

	public static void main(String[] args) {
		FindLongestString fls = new FindLongestString();
		
		String myString1 = "AbCdEFG";
		String pat1 = "dE";
		System.out.println(fls.solution(myString1, pat1));
		
//		String myString2 = "AAAAaaaa";
//		String pat2 = "a";
//		System.out.println(fls.solution(myString2, pat2));
	}

	private String solution(String myString, String pat) {
        int lastIndex = myString.lastIndexOf(pat) + pat.length();
        return myString.substring(0, lastIndex);
	}

}
