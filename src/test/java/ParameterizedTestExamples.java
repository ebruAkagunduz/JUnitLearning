import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author ebru
 * @date Dec, 2021
 */


public class ParameterizedTestExamples {


	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,Integer.MAX_VALUE})
	void testEvent(int number) {
		OddEven oddEven = new OddEven();
		assertTrue(oddEven.isNumberEven(number));
	}

	@ParameterizedTest
	@EnumSource(Animal.class)
	void testEnumSource(Animal animal) {
		assertNotNull(animal);
	}
}
