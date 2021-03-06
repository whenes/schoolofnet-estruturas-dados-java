import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add("Will");
		tree.add("Michelli");
		tree.add("Antonio");
		tree.add("Neide");
		System.out.println(tree);
		
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(23);
		tree1.add(17);
		tree1.add(54);
		tree1.add(16);
		
		Iterator<Integer> it = tree1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
		System.out.println(tree1);
		System.out.println(tree1.first());
		System.out.println(tree1.last());
		System.out.println(tree1.pollFirst());
		System.out.println(tree1.pollLast());
		System.out.println(tree1);
		System.out.println(tree1.isEmpty());
		
		TreeSet tree3 = new TreeSet();
		tree3.add("Will");
		tree3.add(12);
		tree3.add("Antonio");
		tree3.add("Neide");
		System.out.println(tree3);
	}
}
