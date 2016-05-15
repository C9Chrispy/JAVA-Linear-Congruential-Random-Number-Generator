public class trace {
	public int Brute(int a, int b, int c, int M) {
		int x = 0;
		for (int i = 1; i < M + 1; i++) {
			if (i == 1) {
				x = c;
				System.out.print(x + " ");
			}
			else {
				x = ((a*x)+b)%M;
				if (i % 16 == 0) {
					System.out.println(x + " ");
				}
				else {
					System.out.print(x + " ");
				}
			}
		}
		return x;
	}
	public static void main(String[] args) {
		trace test1 = new trace();
		int a = 11;
		int b = 37;
		int c = 1;
		int M = 100;
		test1.Brute(a, b, c, M);
	}
}
