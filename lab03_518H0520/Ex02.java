public class Ex02 {

	public static int ContDigits(int n) {
		if (n < 10) {
			return 1;
		} else {
			return 1 + ContDigits(n / 10);
		}
	}

	public static void main(String[] args) {
		System.out.println(ContDigits(12397));
	}
}
