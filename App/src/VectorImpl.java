import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		Vector v =  new Vector<>();
		v.addElement(1);
		v.addElement("a");
		System.out.println(v.size());
		v.remove(0);
		System.out.println(v.size());
//		while(v.elements().hasMoreElements()) {
//			System.out.println(v.elements().nextElement());
//		}
//		while(v.iterator().hasNext()) {
//			System.out.println(v.iterator().next());
//		}
		Vector v1 = new Vector<>(2, 1);
		v1.addElement(2);
		v1.addElement("b");
		System.out.println(v1.capacity());
		v1.addElement("c");
		System.out.println(v1.capacity());
	}
}
