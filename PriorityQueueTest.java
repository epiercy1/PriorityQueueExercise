import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PriorityQueueTest {

	@Test
	public void testAddingandRemoving() {
		PriorityQueue<Integer>queue = new QueueImplementation<Integer>();
		queue.add(10);
		int item = queue.remove();
		if(item != 10)
			fail("Added 10, popped " + item);
		if(!queue.isEmpty())
			fail("Added 10 and popped it, stack not empty");
	}
}
