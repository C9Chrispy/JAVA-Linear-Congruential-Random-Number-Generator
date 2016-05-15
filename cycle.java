
public class cycle {
	public int cyclePoint(int a, int b, int c, int M) {
		int length = 1;
		// x is slow
		int x = c;
		x = ((a*x)+b)%M;
		// y is fast
		int y = c;
		y = ((a*y)+b)%M;
		y = ((a*y)+b)%M;
		while (x != y) {
			for (int i = 0; i < M; i++) {
				if (i % 2 == 0) {
					x = ((a*x)+b)%M;
					y = ((a*y)+b)%M;
				}
				else {
					y = ((a*y)+b)%M;
				}
				if (x == y) {
					break;
				}
			}
		}
		int shared = x;
		x = ((a*x)+b)%M;
		while (x != shared) {
			x = ((a*x)+b)%M;
			length++;
		}
		System.out.println("Cycle length is " + length);
		return length;
	}
	public static void main(String[] args) {
		cycle test1 = new cycle();
		int a = 78;
		int b = 60;
		int c = 89;
		int M = 129024;
		test1.cyclePoint(a,b,c,M);
	}
}
