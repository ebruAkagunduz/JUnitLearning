import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ebru
 * @date Nov, 2021
 */
public class OddEvenTest {

	@Test
	public void testIsNumberEven() {
		OddEven obj = new OddEven();
		assertTrue(obj.isNumberEven(10));
		assertFalse(obj.isNumberEven(5));

	}
}
