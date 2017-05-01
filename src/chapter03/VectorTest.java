package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		System.out.println("Vector(collection 아님/1.2이전)");
		Vector<String> vector = new Vector<String>();
		
		vector.addElement("마이콜");
		vector.addElement("둘리");
		vector.addElement("도우너");
		
		int count = vector.size();
		for(int i = 0; i< count; i++) {
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		System.out.println("---vector.removeElementAt(1);---");
		vector.removeElementAt(1);
		
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
