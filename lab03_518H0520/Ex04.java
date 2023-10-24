public class Ex04 {

	public static int a(int n) {
		return n == 1? 3: 2*n + 1 + a(n-1);
	}

	public static int d(int n, int r) {
		if (n <= 0 || r <= 0 || n < r) {
			return 1;
		}
		return n * d(n-1, r-1);
	}

	public static int e(int n) {
		return n == 1? 3: (int)Math.pow(2, n) + n*n + e(n-1);
	}

	public static void main(String[] args) {
		System.out.println(d(5, 2));
	}
}
