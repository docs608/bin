
public class MergeSort {
	
	public int[] sort(int[] values) {
		if (values == null) {
			return null;
		}
		if (values.length == 0) {
			return values;
		}
		mergesort(values, 0, values.length - 1);
		return values;
	}
	
	private void mergesort(int[] numbers, int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergesort(numbers, low, middle);
			mergesort(numbers, middle + 1, high);
			merge(numbers, low, middle, high);
		}
	}
	
	private void merge(int[] numbers, int low, int middle, int high) {
		int[] helper = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			helper[i] = numbers[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while(i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle) {
			numbers[k] = helper[i];
			i++;
			k++;
		}
		
		while (j <= high) {
			numbers[k] = helper[j];
			j++;
			k++;
		}
		
	}
	
}
