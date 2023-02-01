public class Main {
    public static void main(String[] args) {
		int N = 18;
		int x = 3;
		int y = 5;
		int ans = 0;

		for(int i=0; i<=N/5; i++) {
			y = 5 * i;
			for(int j=0; j<=N/3; j++) {
				x = 3 * j;
				if( N == ((x*i)+(y*j)) ) ans = i + j;
			}
		}

		if(ans != 0) System.out.print(ans);
		else if(ans == 0) System.out.print(-1);
    }
}