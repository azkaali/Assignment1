//REFERENCE MATERIAL

//https://www.guru99.com/junit-assert.html
//https://junit.org/junit4/javadoc/4.13/org/junit/After.html
//https://examples.javacodegeeks.com/core-java/junit/junit-test-void-method-example/
//https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
//https://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-4-tests

package Array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before; 
import org.junit.BeforeClass;
import org.junit.Test;

import Array.Array;
import Array.ArrayDeletion;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertArrayEquals;
public class ArrayTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	Array array = new Array(); 
	ArrayInsertion ai = new ArrayInsertion(); 
	ArrayDeletion ad=new ArrayDeletion();
	//private static Array a=new Array(); 
	//private ArrayInsertion ai=new ArrayInsertion();
	
	
//	@BeforeClass 
	//public static void setUpBeforeClass() throws Exception {
	//}
	
	//@Before
	//public static void setUpClass() throws Exception {
	//}
	 

	//@AfterClass
	//public static void tearDownAfterClass() throws Exception {
	//}


//	public  void setUp() throws Exception {
		//array.insert(10, 0);
		//a.insert(20, 1);
		//a.insert(30, 2);
		//a.insert(40, 3);
		
		//ad.display(arr);
	//}
	@Before
	public void setUpStreams() {
		
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	

	
	@After
	public void tearDown() throws Exception {
		
		array.delete(3);
		//a.display();
	} 
	
	
	/*@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	*/

	//ARRAY
	@Test
	public void linearSearchtest() throws Exception {
		array.insert(10, 0);
		assertTrue(array.linearSearch(10));
		}
	
	
	
	@Test
	public void linearSearchtest1() throws Exception{
		array.insert(10, 0);
		assertFalse(array.linearSearch(70));
	}
	
	
	
	
	@Test
	public void binarySearchtest() throws Exception{
		array.insert(10, 0);

		assertTrue(array.binarySearch(10, 0, 1));
	}
	
	
	@Test
	public void binarySearchtest1() throws Exception{
		
		assertFalse(array.binarySearch(90, 0, 1));
		//fail("Not yet implemented");
	} 
	

 
 
	@Test
	public void ArrayInsertiontest1() throws Exception{
		int arr[]= {};
		int a[]= {};
	assertArrayEquals(arr,ai.insert(arr, 0, 0));
	} 

	
	@Test
	public void out() throws Exception {
		//setUp();
		array.insert(10, 0);
		array.insert(20, 1);
		array.insert(30, 2);
		setUpStreams();

		array.display();
	    assertEquals("10 20 30",outContent.toString().trim().replace("\r",""));
	}
	
	
	@Test
	public void out1() throws Exception {
		array.insert(30, 0);
		array.insert(70, 1);
		array.insert(10, 2);

		array.bubbleSort();
	    //equals(array.bubbleSort());
	}
	
	
	
	/*@Test
	public void err() {
	    System.err.print("hello again");
	    assertEquals("hello again", errContent.toString());
	}
	*/
	
	/*
	@Test
	public void ArrayInsertiontest1() throws Exception{
		int array[]= {1,2,3,4};
		int a[]= {};
	
	} 
	*/
	
	// Array DEleTION
	@Test
	public void deleteDisplay() throws Exception {
		int arr[]= {1,2,3,4};
		ad.display(arr);
	    assertEquals("1 2 3 4",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void deleteDisplay1() throws Exception {
		int arr[]= {1,2,4};
		ad.display(arr);
	    assertNotEquals("1 2 3 4",outContent.toString().trim().replace("\r",""));
	}
	
	@Test
	public void deleteInsert2() throws Exception {
		int arr[]= {2,4};
		ad.delete(arr, 0);
	    assertArrayEquals(arr,ad.delete(arr, 0));
	}
	
	@Test
	public void deleteInsert3() throws Exception {
		int arr[]= {2,4,5,6};
		ad.delete(arr, -1);
	   // assertNotEquals(arr,ad.delete(arr, -1));
	   // fail("Failed");
	}
	
	
	
	//ARRAY INSETION
	@Test
	public void arrayInsert1() throws Exception {
		int arr[]= {2,4};
		
	    assertArrayEquals(arr,ai.insert(arr, 1,1));
	}
	
	
	
	
	
	
}
