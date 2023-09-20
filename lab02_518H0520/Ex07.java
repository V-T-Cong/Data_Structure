import java.util.*;

public class Ex07 {

	public static boolean isPalidrome(String str) {
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
			queue.offer(str.charAt(i));
		}
		while(! stack.isEmpty()) {
			if (!stack.pop().equals(queue.poll())) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalidrome("abcba"));
		System.out.println(isPalidrome("bcbca"));
	}
}
