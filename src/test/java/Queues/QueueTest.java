package Queues;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private QueueLL lq;
	private Que cq;
	private Queue aq;
	private Dequeue dq;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lq.dequeue();
		lq=new QueueLL();
		cq=new Que(4);
		aq=new Queue(4);
		dq=new Dequeue(4);
		aq.display();
		lq.display();
		cq.display();
		dq.display();
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		aq.enqueue(5);
		lq.enqueue(2);
		lq.enqueue(3);
		lq.enqueue(4);
		lq.enqueue(5);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.enqueue(6);
		dq.addLeft(19);
		dq.addRight(20);
		
	}

	@After
	public void tearDown() throws Exception {
		
		aq.display();
		cq.display();
		lq.display();
		dq.display();
		aq.dequeue();
		lq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		
	} 

	//QUEUES USING ARRAYS

	@Test
	public void ArrayQueueSizetest1() {
		assertEquals(4,aq.size());
	}
	@Test
	public void ArrayQueueSizetest2() {
		assertNotEquals(50,aq.size());
	}
	@Test
	public void ArrayQueueEmptytest1() {
		assertFalse(aq.empty());
	}
	
	@Test
	public void ArrayQueueEmptytest2() throws Exception {
		assertTrue(!aq.empty());
	}
	
	 
	//QUEUES USING LINKEDLISTS
	
	
	
	
	
	
}
