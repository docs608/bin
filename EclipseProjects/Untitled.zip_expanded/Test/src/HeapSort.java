
public class HeapSort {

	public int[] sort(int[] values) {
		if (values == null) {
			return null;
		}
		if (values.length == 0) {
			return values;
		}
		int n = values.length;
		for (int i = n/2 - 1; i >= 0; i--) {
			heapify(values, i, n);
		}
		for (int i = n - 1; i >= 0; i--) {
			int temp = values[i];
			values[i] = values[0];
			values[0] = temp;
			heapify(values, 0, i);
		}
		return values;
	}
	
	private void heapify(int[] numbers, int root, int heapSize) {
		int largest = root;
		int l = 2*root + 1;
		int r = 2*root + 2;
		if (l < heapSize && numbers[l] > numbers[largest]) {
			largest = l;
		}
		if (r < heapSize && numbers[r] > numbers[largest]) {
			largest = r;
		}
		if (largest != root) {
			int temp = numbers[largest];
			numbers[largest] = numbers[root];
			numbers[root] = temp;
			heapify(numbers, largest, heapSize);
		}
	}
}
