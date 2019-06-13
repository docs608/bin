import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class SortTest {
	
	private int[] numbers;
	private final static int SIZE = 7;
	private final static int MAX = 20;
	Sort sorter = new BubbleSort();
	
	@Before
	public void setUp() throws Exception {
		numbers = new int[SIZE];
		Random generator = new Random();
		for (int i = 0; i < SIZE; i++) {
			numbers[i] = generator.nextInt(MAX);
		}
	}

	@Test
	public void testNull() {
		sorter.sort(null);
	}
	
	@Test
	public void testEmpty() {
		sorter.sort(new int[0]);
	}
	
	@Test
	public void testSimpleElement() {
		int[] elements = {5};
		sorter.sort(elements);
	}

	@Test
	public void testSpecial() {
		int[] elements = {-3, 2, 2, 5, 5, 2, 8, 7, -9, 6, 5};
		sorter.sort(elements);
		assertTrue(validate(elements));
	}

	@Test
	public void testSort() {
		SortingUtility.printArray(numbers);
		sorter.sort(numbers);
		SortingUtility.printArray(numbers);
		assertTrue(validate(numbers));
	}
	
	private boolean validate(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return true;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}
	
}
