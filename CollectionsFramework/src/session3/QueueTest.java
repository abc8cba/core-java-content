package session3;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
//		System.out.println(q.poll());
//		System.out.println(q.remove());

		System.out.println(q.peek());
		System.out.println(q.element());
		
		/*System.out.println(q.add(20));
		q.add(50);
		q.add(30);
		q.add(10);
		q.add(60);
		q.add(40);*/
		
		System.out.println(q.offer(30));
//		q.offer(30);
//		q.offer(60);
//		q.offer(40);
//		q.offer(50);
//		q.offer(90);
//		q.offer(10);
		
		/*System.out.println(q);
		//System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q);*/
		
//		System.out.println(q);
//		//System.out.println(q.peek());
//		System.out.println(q.element());
//		System.out.println(q);

	}

}
