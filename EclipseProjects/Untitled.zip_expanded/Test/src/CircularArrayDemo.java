
public class CircularArrayDemo {

	public static void main(String[] args) {
		int size = 10;
		CircularArray<String> circularArray = new CircularArray<>(size);
		for (int i = 0; i < size; i++) {
			circularArray.set(i, Integer.toString(i));
		}

		printCircularArray(circularArray);
		
		circularArray.rotateLeft(22);

		printCircularArray(circularArray);
		
		circularArray.rotateRight(33);

		printCircularArray(circularArray);
		
	}

	public static void printCircularArray(CircularArray<String> circularArray) {
		for (String elements : circularArray) {
			System.out.print(elements + " ");
		}
		System.out.println();
	}
}
