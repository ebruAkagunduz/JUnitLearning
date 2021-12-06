import org.junit.jupiter.api.*;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

/**
 * @author ebru
 * @date Nov, 2021
 */


@DisplayName("Kron - Junit Presentation")
public class UtilTest {

	public UtilTest() {
		System.out.println("UtilTest - Constructor got executed");
	}


	@Disabled
	@Test
	void showAssertions() {
		Util u = new Util();
		assertNull(u.getString("1"), "Returned value not null");
		assertNotNull(u.getString("2"), "Returned value null");


		/* --------------- assertEquals --------------- */
		assertEquals("", "");
		assertEquals("test", "test");
		Util u2 = new Util();
		//assertEquals(u, u2);
		u2 = u;
		assertEquals(u2, u);
		//assertNotEquals("2345", "2345");

		/* --------------- assertSame --------------- */
		String actual = "hello";
		String expected = "hello";
		assertSame(expected, actual);

		actual = "hell";
		expected = "hello";
		//assertSame(expected, actual);



		Student s1 = new Student(1, "Ayse");
		Student s2 = new Student(1, "Ayse");

		assertEquals(s1, s2, "Objects has different addresses!");

		/*Map<Student, String> map = new HashMap<Student, String>();
		map.put(s1, "object s1");
		map.put(s2, "object s2");

		for (Map.Entry<Student, String> e: map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}*/

		/* --------------- assertThrows --------------- */
		assertThrows(ArithmeticException.class, () -> divide(1, 0));
		//assertThrows(ArithmeticException.class, () -> divide(1, 1));
		assertThrows(Exception.class, () -> divide(1, 0));
		//assertThrows(IOException.class, () -> divide(1, 0));

		/* --------------- assertTimeout --------------- */
		assertTimeout(Duration.ofMinutes(3), () -> {
			//System.out.println("Perform task that takes less than 3 minutes.");
		});


		 //--------------- assertTimeout ---------------
/*
		assertTimeout(Duration.ofMillis(10), () -> {
			Thread.sleep(100);
		});
*/


		/* --------------- assertTimeoutPreemptively --------------- */
		// The executable provided to the test case will be executed in the different thread as that of the calling code.
		//Also, the execution of the executable will be preemptively aborted if the timeout is exceeded.
		/*assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
			Thread.sleep(100);
		});*/

	}

/*
	@Test
	void showFails() {
		//fail();
		fail("@Test method not yet implemented !!!");
		//fail(new RuntimeException("@Test method not yet implemented !!!"));
		//fail("@Test method not yet implemented !!!", new RuntimeException("Failed explicitly"));
	}
*/


/*
	@BeforeAll
	public static void beforeAll() {
		System.out.println("UtilTest - beforeAll() got executed !!!");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("UtilTest - beforeEach() got executed !!!");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("UtilTest - afterEach() got executed !!!");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("UtilTest - afterAll() got executed !!!");
	}*/

/*	@Test
	void showAssumption() {
		//System.setProperty("ENV", "PROD");
		assumeFalse(6>5);
		// remainder of test will proceed
	}*/

/*
	@Test
	void showBeforeAfterAnnotations() {
		System.out.println("Run showBeforeAfterAnnotations test case");
		// some assertions

	}
*/



	private int divide(int a, int b) {
		return a / b;
	}

}
