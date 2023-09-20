public class Ex03 {

	public static int function(int n) {
		MyStack<Integer> stack = new MyStack<>();
		stack.push(3);
		for(int i = 2; i <= n; i++) {
			stack.push((int) Math.pow(2, i) + i * i);
		}
		int result = 0;
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			System.out.println(function(i));
		}
	}
}
