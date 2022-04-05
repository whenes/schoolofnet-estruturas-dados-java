import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {
	public static void main(String[] args) {
		List<Person> p = new ArrayList<Person>();
		p.add(new Person("Will", 33));
		p.add(new Person("Whenes", 34));
		p.add(new Person("Michelli", 27));
		p.add(new Person("Neide", 16));

		for (Person pf : p) {
			System.out.println(pf.getName() + " - " + pf.getAge());
		}
		
		Collections.sort((List)p);
		
		for (Person pf : p) {
			System.out.println(pf.getName() + " - " + pf.getAge());
		}
	}
}
