package ingredient;

public class Test {

	public static void main(String[] args) {
		Test tt = new Test();
		
		int n1 = 5;
		tt.solution(n1);
	}
	
	public void solution(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}