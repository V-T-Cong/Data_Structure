public class Ex05 {

	public static boolean isBalanced(String seq) {
		MyStack<Character> stack = new MyStack<>();
		char ch;

		for(int i = 0; i < seq.length(); i++) {
			ch = seq.charAt(i);
			if (isleft(ch)) {
				stack.push(ch);
			}
			else {
				if (!isMatched(stack.pop(), ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static boolean isMatched(char left, char right) {
		return (left == '(' && right ==')') ||
				(left == '[' && right == ']') ||
				(left == '{' && right == '}');
	}

	public static boolean isleft(char ch) {
		switch(ch) {
			case '(':
			case '[':
			case '{':
				return true;
			default:
				break;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("({[])"));
		System.out.println(isBalanced("{[(())]}"));
	}
}
