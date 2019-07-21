import java.util.Iterator;

public class CircularArray<T> implements Iterable<T> {

	T[] items;
	int head = 0;

	public CircularArray(int size) {
		items = (T[]) new Object[size];
	}

	public int size() {
		return items.length;
	}
	
	public T get(int index) {
		if (index < 0 || index >= items.length) {
			throw new IndexOutOfBoundsException("Array index out of bound..");
		}
		return items[convert(index)];
	}

	public void set(int index, T val) {
		items[convert(index)] = val;
	}
	
	public void rotateLeft(int shift) {
		head = convert(shift);
	}

	public void rotateRight(int shift) {
		head = convert(-1 * shift);
	}
	
	private int convert(int index) {
		index = index % items.length;
		if (index < 0) {
			index = index + items.length;
		}
		return (head + index) % items.length;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new CircularArrayIterator();
	}
	
	private class CircularArrayIterator implements Iterator<T> {
		private int _current = -1;
		
		public CircularArrayIterator() {}

		@Override
		public boolean hasNext() {
			return _current < items.length - 1;
		}

		@Override
		public T next() {
			_current++;
			return items[convert(_current)];
		}
	}
	
}
