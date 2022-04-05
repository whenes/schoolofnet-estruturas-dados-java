import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		System.out.println(q.add("a"));
		System.out.println(q.add("b"));
		System.out.println(q.element());
		System.out.println("Poll: " + q.poll());
		System.out.println(q.element());
		System.out.println("Peek: " + q.peek());
		System.out.println("Poll: " + q.poll());
		System.out.println("Peek: " + q.peek());
	}
}
