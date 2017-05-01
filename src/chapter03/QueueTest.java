package chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("마이콜");
		q.offer("도우너");
		q.offer("둘리");
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.size());
		
		System.out.println(q.peek()); //front를 빼오지 않고(poll하지 않고) 확인만 함
		
		System.out.println(q.poll());
		System.out.println(q.poll()); //queue가 비어있는 경우, exception이 발생하지 않고 null이 나온다.(마이너스 되는 것이 아님)
		
	}

}
