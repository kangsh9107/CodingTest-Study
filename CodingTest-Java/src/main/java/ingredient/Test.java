package ingredient;

public class Test {

	public static void main(String[] args) {
		Test tt = new Test();
		
		int n1 = 5;
		tt.solution(n1);
	}
	
	public void solution(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<n*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}