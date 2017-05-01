package chapter03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		System.out.println("LinkedLSist");
		List<String> list = new LinkedList<String>();
							  //----------만 수정하면, Vector(Collection), ArrayList, LinkedList는 모두 똑같이 사용할 수 있다.
		
		list.add("마이콜");
		list.add("둘리");
		list.add("도우너");

		int count = list.size();
		for(int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		System.out.println("---list.remove(1);---");
		list.remove(1);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
