package ingredient;

public class Star {

	public static void main(String[] args) {
		Star tt = new Star();
		
		int n1 = 5;
		tt.solution(n1);
	}
	
	public void solution(int n) {
//		for(int i=0; i<n; i++) {
//			for(int j=1; j<n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i*2+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<n*2; i+=2) {
			for(int j=n*2-1; j>i; j-=2) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<n*2; i+=2) {
			for(int j=1; j<i; j+=2) {
				System.out.print(" ");
			}
			for(int k=n*2; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=n; i>0; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=n; k>=i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=n; i++) {
//			for(int j=n; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}