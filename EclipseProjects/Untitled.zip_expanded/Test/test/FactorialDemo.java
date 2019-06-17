
public class FactorialDemo {
	
	private static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	private static int tailRecursiveFactorial(int number) {
		return tailRecursiveFactorial(number, 1);
	}
	
	private static int tailRecursiveFactorial(int number, int result) {
		if (number == 0) {
			return result;
		}
		return tailRecursiveFactorial(number - 1, result * number);
	}
	
	private static int tailRecursiveFactorialToIterative(int number) {
		int result = 1;
		while (true) {
			if (number == 0) {
				return result;
			}
			result = result * number;
			number = number - 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("factorial: " + factorial(5));
		System.out.println("factorial: " + tailRecursiveFactorial(5));
		System.out.println("factorial: " + tailRecursiveFactorialToIterative(5));
	}
}
