public class Ex01 {

	public static int a(int n) {
		int count = 1;
		while (n > 10) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static int e(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(a(123));
		System.out.println(e(40, 125));
	}
}
