public class Ex05 {

	public static int dec2bin(int n) {
		if (n <= 0) {
			return 0;
		}

		int d = n % 2;
		int a = dec2bin(n/2);
		return a * 10 + d;
	}

	public static void main(String[] args) {
		System.out.println(dec2bin(12));
		System.out.println(dec2bin(13));
	}
}
