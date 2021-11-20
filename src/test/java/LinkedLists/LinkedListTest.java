package LinkedLists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	LinkedListSwap ls;
	LinkedList l;
	LL ll;
	CircularLinkedList cl;

	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@Before
	public void setUp() throws Exception {
	
		ls=new LinkedListSwap();
		l=new LinkedList();
		ll=new LL();
		cl=new CircularLinkedList();
	}
	

	@After
	public void tearDown() throws Exception {
		ls.display();
		l.display();
		ll.display();
		cl.display();

	}
	
	//LINKED LISTS

	@Test
	public void pushFrontTest1() throws Exception {
		setUpStreams();
		l.pushFront(1);
	    assertEquals("Inserting node at front : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void pushFrontTest2() throws Exception {
		setUpStreams();
		l.pushFront(3);
	    assertNotEquals("Inserting node at front : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void pushBackTest1() throws Exception {
	
		l.pushBack(2);
		setUpStreams();
	    assertNotEquals("Inserting node at back  :  2",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void pushBackTest2() throws Exception {
		setUpStreams();
		l.pushBack(5);
	    assertNotEquals("Inserting node at back : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void popFrontTest1() throws Exception {
		setUpStreams();
		l.popFront();
	    assertEquals("PopFront Operation.",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void popBackTest() throws Exception {
		setUpStreams();
		l.popBack();
	    assertEquals("PopBack Operation.",outContent.toString().trim().replace("\r",""));
	}
	
	
	@Test
	public void popTest1() throws Exception {
		setUpStreams();
		l.pop(1);
	    assertEquals("Poping element at pos : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void popTest2() throws Exception {
		setUpStreams();
		l.pop(0);
	    assertNotEquals("Poping element at pos : 1",outContent.toString().trim().replace("\r",""));
	}
	
	
	//LL
	
	@Test
	public void LLpushFrontTest1() throws Exception {
		setUpStreams();
		ll.pushFront(1);
	    assertEquals("Inserting element at the front of the list : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLpushFrontTest2() throws Exception {
		setUpStreams();
		ll.pushFront(2);
	    assertNotEquals("Inserting element at the front of the list : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLpushBackTest1() throws Exception {
		setUpStreams();
		ll.pushBack(1);
	    assertEquals("Inserting element at the back of the list : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLpushBackTest2() throws Exception {
		setUpStreams();
		ll.pushBack(2);
	    assertNotEquals("Inserting element at the back of the list : 1",outContent.toString().trim().replace("\r",""));
	}

	@Test
	public void LLtopBackTest1() throws Exception {
		ll.add(10);
	    assertEquals(10,ll.topBack());
	}
	
	@Test
	public void LLtopBackTest2() throws Exception {
		ll.add(10);
	    assertNotEquals(11,ll.topBack());
	}
	
	@Test
	public void LLDisplayTest1() throws Exception {
		
		setUpStreams();
		ll.display();
	    assertNotEquals("LinkedList : [ 10 11 12 ]",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLpopTest1() throws Exception {
		
		setUpStreams();
		ll.popFront();
		assertEquals("PopFront Operation.",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLsizeTest1() throws Exception {
		ll.numofElements=10;
	    assertEquals(10,ll.size());
	}
	
	@Test
	public void LLsizeTest2() throws Exception {
		ll.numofElements=20;
	    assertNotEquals(10,ll.size());
	}
	
	
	//SWAPLL
	
	@Test
	public void LLSwappushFrontTest1() throws Exception {
		setUpStreams();
		ls.pushFront(10);
		assertEquals("Inserting data at front : 10",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLSwappushFrontTest2() throws Exception {
		setUpStreams();
		ls.pushFront(2);
	    assertNotEquals("Inserting data at front : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLSwappushBackTest1() throws Exception {
		setUpStreams();
		ls.pushBack(1);
	    assertEquals("Inserting data at back  : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void LLSwappushBackTest2() throws Exception {
		setUpStreams();
		ls.pushBack(2);
	    assertNotEquals("Inserting data at back  : 1",outContent.toString().trim().replace("\r",""));
	}
	
	
	//CIRCULARLINKEDLIST
	
	@Test
	public void CLLFrontTest1() throws Exception {
		setUpStreams();
		cl.pushFront(10); 
		assertEquals("Inserting data at front : 10",outContent.toString().trim().replace("\r",""));
		//cl.pushBack(1);
		 //assertEquals("Inserting data at back  : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void CLLLpushFrontTest2() throws Exception {
		setUpStreams();
		cl.pushFront(2);
	    assertNotEquals("Inserting data at front : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void CLLpushBackTest1() throws Exception {
		setUpStreams();
		cl.pushBack(1);
	    assertEquals("Inserting data at back  : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void CLLpushBackTest2() throws Exception {
		setUpStreams();
		cl.pushBack(2);
	    assertNotEquals("Inserting data at back  : 1",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void CLLpopTest1() throws Exception {
		
		setUpStreams();
		cl.popBack();
		assertEquals("PopBack Operation  : Empty List.",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void CLLpopFrontTest1() throws Exception {
		
		setUpStreams();
		cl.popFront();
		assertEquals("PopFront Operation : Empty List.",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void CLLpopFrontSuccessfulTest1() throws Exception {
		
		setUpStreams();
		cl.pushFront(1);
		cl.popFront();
		assertNotEquals("Successfull.",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void CLLpopBackSuccessfulTest1() throws Exception {
		
		setUpStreams();
		cl.popBack();
		assertNotEquals("Successfull.",outContent.toString().trim().replace("\r",""));
	}
	
	
	
	
}
