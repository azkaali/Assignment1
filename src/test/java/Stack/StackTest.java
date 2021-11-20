package Stack;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTest {

	private ArrayStack as=new ArrayStack();
	private MyStack ms= new MyStack(10);
	private Stack s= new Stack();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		s.display();
		ms.displayStack();
		as.display();
		as.push(10);
		as.push(20);
		as.push(30);
		as.push(40);
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		s.push(22);
		s.push(23);
		s.push(24);
		s.push(25);



	}

	@After
	public void tearDown() throws Exception {
		as.display();
		ms.displayStack();
		s.display();

	}

	@Test
	public void poptest() {
		assertEquals(as.pop(),40);
	}
	 
	@Test
	public void poptest1 () throws Exception{
		 int expected = 10;
		    assertNotEquals(as.pop(), expected);
	
	}
	
	@Test
	public void mystacktop1() throws Exception {
		assertNotEquals(10,ms.top());
		//fail("Not yet implemented");
	}
	
	@Test
	public void mystacktop2() throws Exception {
		assertEquals(4,ms.top());
		//fail("Not yet implemented");
	}
	
	@Test
	public void mystackpop1() throws Exception {
		assertEquals(4,ms.pop());
		//fail("Not yet implemented");
	}
	
	@Test 
	public void mystackpop2() throws Exception {
		assertNotEquals(100,ms.pop());
		//fail("Not yet implemented");
	}
	
	@Test
	public void sizetest1() throws Exception {
		assertEquals(4,ms.size());
		//fail("Not yet implemented");
	}
	 
	@Test
	public void sizetest2() throws Exception {
		assertNotEquals(2,ms.size());
		//fail("Not yet implemented");
	}
	
	@Test
	public void linkedListpop1() throws Exception {
		assertEquals(25,s.pop());
		//fail("Not yet implemented");
	}
	
	@Test
	public void linkedListpop2() throws Exception {
		assertNotEquals(35,s.pop());
		//fail("Not yet implemented");
	}
	
	@Test
	public void linkedListtop1() throws Exception {
		assertEquals(25,s.top());
		//fail("Not yet implemented");
	}

	@Test
	public void linkedListtop2() throws Exception {
		assertNotEquals(35,s.top());
		//fail("Not yet implemented");
	}
	
	@Test
	public void linkedListsize1() throws Exception {
		assertNotEquals(3,s.getSize());
		//fail("Not yet implemented");
	}
	
	@Test
	public void linkedListsize2() throws Exception {
		assertEquals(4,s.getSize());
		//fail("Not yet implemented");
	}
	
	
 

}
