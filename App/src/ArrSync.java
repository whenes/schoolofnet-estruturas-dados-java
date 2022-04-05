import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {
	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Will");
		list.add("Test");
		list.add("abutre");
		synchronized (list) {
			Iterator<String> iterator = list.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		
		List<String> list1 = new CopyOnWriteArrayList<String>();
		list1.add("Will 1");
		list1.add("Test 1");
		list1.add("abutre 1");
		Iterator it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
