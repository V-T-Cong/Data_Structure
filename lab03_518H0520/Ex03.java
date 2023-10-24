public class Ex03 {

	public static boolean checkPrime(int n, int d) {
		if (d == 1) {
			return true;
		}
		return n % d == 0 ? false : checkPrime(n, d -1);
	}

	public static boolean checkPrime(int n) {
		return checkPrime(n, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(checkPrime(2));
		System.out.println(checkPrime(7));
		System.out.println(checkPrime(10));
	}
}