
public class BubbleSort implements Sort {
	
	public int[] sort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return arr;
		}
		bubbleSort(arr);
		return arr;
	}
	
	private void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					SortingUtility.swap(arr, j, j + 1);
				}
			}
		}
	}
	
}
