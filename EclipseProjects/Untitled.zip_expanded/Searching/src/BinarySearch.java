
public class BinarySearch implements Search {

	@Override
	public int search(int[] arr, int value) {
		return binarySearch(arr, 0, arr.length - 1, value);
	}
	
	private int binarySearch(int[] arr, int low, int high, int value) {
		if (low <= high) {
			int middle = low + (high - low) / 2;
			if (arr[middle] == value) {
				return middle;
			} else if (arr[middle] > value) {
				return binarySearch(arr, low, middle - 1, value);
			} else {
				return binarySearch(arr, middle + 1, high, value);
			}
		}
		return -1;
	}

}
