import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ebru
 * @date Dec, 2021
 */

@DisplayName("A queue")
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class TestingAQueueDemo {
	Queue<String> queue; // A Queue of String

	@Test
	@DisplayName("is null")
	void isNotInstantiated() {
		assertNull(queue);
	}

	@Nested
	@Order(2)
	@DisplayName("after new")
	class AfterNew {
		@Test
		@DisplayName("After new test")
		void test() {
			assertTrue(true);
		}
	}

	@Nested
	@Order(1)
	@DisplayName("when new")
	class WhenNew {

		@BeforeEach
		void createNewStack() {
			queue = new LinkedList<>();
		}

		@Test
		@DisplayName("is empty")
		void isEmpty() {
			assertTrue(queue.isEmpty());
		}

		@Test
		@DisplayName("return null element when polled")
		void returnNullWhenPolled() {
			assertNull(queue.poll());
		}

		@Test
		@DisplayName("return null element when peeked")
		void returnNullWhenPeeked() {
			assertNull(queue.peek());
		}

		@Nested
		@DisplayName("after offering an element")
		class AfterOffering {

			String anElement = "an element";

			@BeforeEach
			void offerAnElement() {
				queue.offer(anElement);
			}

			@Test
			@DisplayName("it is no longer empty")
			void isNotEmpty() {
				assertFalse(queue.isEmpty());
			}

			@Test
			@DisplayName("returns the element when polled and is empty")
			void returnElementWhenPolled() {
				assertEquals(anElement, queue.poll());
				assertTrue(queue.isEmpty());
			}

			@Test
			@DisplayName("returns the element when peeked but remains not empty")
			void returnElementWhenPeeked() {
				assertEquals(anElement, queue.peek());
				assertFalse(queue.isEmpty());
			}
		}
	}

}