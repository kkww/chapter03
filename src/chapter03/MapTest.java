package chapter03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("둘리", new Integer(10)); //map.put("둘리", 10); 와 같다. (boxing)
		map.put("마이콜", 90);
		map.put("도우너", 80);		
		map.put("또치", 70);
		
		System.out.println(map.get(new String("도우너")));
		System.out.println(map.size());
		
		map.put("둘리", 95);
		System.out.println(map.size() + ":" + map.get("둘리"));
		
		//평균 구하기(key는 set에 저장되어 있다.)
		Set<String> set = map.keySet();
		int count = set.size();
		int sum = 0;
		
		System.out.println(set.contains(new Value(10, 20))); //값 유무 확인
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print(key);
			int score = map.get(key); //key에서 int로 auto-boxing
			sum += score;
		}
		
		System.out.println("평균 : " + sum/count);
		
	}

}
