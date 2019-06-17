
public class QuickSort implements Sort {
	
	public int[] sort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return arr;
		}
//		quickSort(arr, 0, arr.length - 1);
		quickSortTailRecursive(arr, 0, arr.length - 1);
		return arr;
	}
	
	private void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partitionedIndex = partition(arr, low, high);
			quickSort(arr, low, partitionedIndex - 1);
			quickSort(arr, partitionedIndex + 1, high);
		}
	}
	
	private void quickSortTailRecursive(int[] arr, int low, int high) {
		while (true) {
			if (low < high) {
				int partitionedIndex = partition(arr, low, high);
				quickSort(arr, low, partitionedIndex - 1);
				partitionedIndex = partitionedIndex + 1;
			}
		}
	}
	
	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				SortingUtility.swap(arr, i, j);
			}
		}
		SortingUtility.swap(arr, i + 1, high);
		return i + 1;
	}
	
}
