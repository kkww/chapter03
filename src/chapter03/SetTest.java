package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Value> set = new HashSet<Value>();
		
		Value v1 = new Value(10, 20);
		Value v2 = new Value(10, 20);
		
		set.add(v1);
		set.add(v2);
		//순서가 없기 때문에 Indexing은 할 수 없다.
		
		Iterator<Value> it = set.iterator();
		while(it.hasNext()) {
			Value v = it.next();
			System.out.println(v); //hashCode()를 override 하지 않으면, 같은 값을 가진 v1, v2가 모두 set에 들어간다.
		}
		
		set.remove(new Value(10,20)); //내용 기반으로 set이 삽입/삭제 되므로 set.add(v1); set.add(v2); 와 같은 말이다.
		
		System.out.println(set.size());
	}

}
