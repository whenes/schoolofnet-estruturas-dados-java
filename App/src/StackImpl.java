import java.util.Random;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		Stack s = new Stack<>();
		Random random = new Random();
		
		int i = 5;
		while(i != 0) {
			System.out.println("Push: " + s.push(random.nextInt(20)));
			i--;
		}

		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.println("Pop: " + s.pop());		
		}
		
		System.out.println(s.isEmpty());
		
	}
}
