import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		MyStack<Character> stack = new MyStack<>();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for(int i = 0; i < str.length(); i ++) {
			stack.push(str.charAt(i));
		}
		sc.close();

		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}
