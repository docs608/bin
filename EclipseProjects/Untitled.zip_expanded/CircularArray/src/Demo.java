
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 10;
		CircularArray<String> array = new CircularArray<String>(size);
		for (int i = 0; i < size; i++) {
			array.set(i, String.valueOf(i));
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array.get(i) + " ");
		}

		System.out.println();
		
		array.rotate(2);
		for (int i = 0; i < size; i++) {
			System.out.print(array.get(i) + " ");
		}
		
		System.out.println();
		
		array.rotate(2);
		for (String s : array) {
			System.out.print(s + " ");
		}
	}

}
