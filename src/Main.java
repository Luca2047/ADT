import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ArrayStack stack = new ArrayStack();
		stack.push(2);
		stack.push(66);
		stack.push(22);

		ArrayStack copy = stack.copy(stack);
		System.out.println(copy.top());
		copy.pop();
		System.out.println(copy.top());
		copy.pop();
		System.out.println(copy.top());
		copy.pop();

	}

}
