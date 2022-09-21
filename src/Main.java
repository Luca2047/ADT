import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/*ArrayStack stack = new ArrayStack();
		stack.push(2);
		stack.push(66);
		stack.push(22);

		ArrayStack copy = stack.copy();
		System.out.println(copy.top());
		copy.pop();
		System.out.println(copy.top());
		copy.pop();
		System.out.println(copy.top());
		copy.pop();*/

		ArrayQueue queue = new ArrayQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		ArrayQueue queue2 = new ArrayQueue();
		queue2.enqueue(1);
		queue2.enqueue(2);
		queue.concat(queue2);

		//komplette Queue ausgeben
		for (int i=0; i< queue.eoq+1;i++) {
			System.out.println(queue.queue[i]);
		}

	}

}
