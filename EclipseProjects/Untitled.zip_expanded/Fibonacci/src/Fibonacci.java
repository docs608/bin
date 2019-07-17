/**
 * https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 * @author shubham
 */
public class Fibonacci {

	static final int MAX = 1000; 
	static final int NIL = -1;
	static int lookupTableForDPMemoization[] = new int[MAX]; 
	static int lookupTableForFormulaMemoization[] = new int[MAX]; 

	public static void main(String[] args) {
		int n = 10;
		
		System.out.println(fib(n));  // Time complexity : O(n), Space complexity : O(1)
		
		System.out.println(fibRecursive(n));
		// for above technique,
		// Time complexity : T(n) = T(n-1) + T(n-2) which is exponential,
		// Space complexity : O(n) if we consider the function call stack size, otherwise O(1),
		
		System.out.println(fibTailRecursive(n, 0, 1));  // Time complexity : O(n), Space complexity : O(1)
		// for above technique,
		// Time complexity : O(n),
		// Space complexity : O(n) if we consider the function call stack size, otherwise O(1),

		_initialize(lookupTableForDPMemoization, NIL);
		System.out.println(fibDPMemoization(10));  // Time complexity : O(n), Space complexity : O(n)
		
		System.out.println(fibDPTabulation(n));  // Time complexity : O(n), Space complexity : O(n)
		
		System.out.println(fibUsingFormula(n));  // Time complexity : O(1), Space complexity : O(1)

		_initialize(lookupTableForFormulaMemoization, NIL);
		System.out.println(fibFormulaMemoization(10));  // Time complexity : O(n), Space complexity : O(n)

		System.out.println(fibMatrixMultiplication(n));  // Time complexity : O(n), Space complexity : O(1)
		
		System.out.println(fibOptimizedMatrixMultiplication(n));  // Time complexity : O(log n), Space complexity : O(1)
		
	}

	static int fibOptimizedMatrixMultiplication(int n) {
		int F[][] = new int[][]{{1,1},{1,0}}; 
		if (n == 0) 
			return 0; 
		optimizedPower(F, n-1); 

		return F[0][0]; 
	}

	static void optimizedPower(int F[][], int n) {
		if( n == 0 || n == 1) 
			return; 
		int M[][] = new int[][]{{1,1},{1,0}}; 

		optimizedPower(F, n/2); 
		multiply(F, F); 

		if (n%2 != 0) 
			multiply(F, M); 
	} 

	static int fibMatrixMultiplication(int n) {
		int F[][] = new int[][]{{1,1},{1,0}}; 
		if (n == 0) 
			return 0; 
		power(F, n-1); 

		return F[0][0]; 
	}

	static void power(int F[][], int n) {
		int i; 
		int M[][] = new int[][]{{1,1},{1,0}}; 

		// n - 1 times multiply the matrix to {{1,0},{0,1}} 
		for (i = 2; i <= n; i++) 
			multiply(F, M); 
	} 

	static void multiply(int F[][], int M[][]) {
		int x = F[0][0]*M[0][0] + F[0][1]*M[1][0]; 
		int y = F[0][0]*M[0][1] + F[0][1]*M[1][1]; 
		int z = F[1][0]*M[0][0] + F[1][1]*M[1][0]; 
		int w = F[1][0]*M[0][1] + F[1][1]*M[1][1]; 

		F[0][0] = x; 
		F[0][1] = y; 
		F[1][0] = z; 
		F[1][1] = w; 
	} 

	public static int fibFormulaMemoization(int n) {
		// Base cases 
		if (n == 0) 
			return 0; 

		if (n == 1 || n == 2) 
			return (lookupTableForFormulaMemoization[n] = 1); 

		// If fib(n) is already computed 
		if (lookupTableForFormulaMemoization[n] != NIL) 
			return lookupTableForFormulaMemoization[n]; 

		int k = (n & 1) == 1? (n + 1) / 2
				: n / 2; 

		// Applyting above formula [Note value n&1 is 1 if n is odd, else 0. 
		lookupTableForFormulaMemoization[n] = (n & 1) == 1 ? 
				(fibFormulaMemoization(k) * fibFormulaMemoization(k) + 
						fibFormulaMemoization(k - 1) * fibFormulaMemoization(k - 1)) 
				: 
					(2 * fibFormulaMemoization(k - 1) + fibFormulaMemoization(k)) * fibFormulaMemoization(k); 

		return lookupTableForFormulaMemoization[n]; 
	}

	static int fibUsingFormula(int n) { 
		double phi = (Math.sqrt(5) + 1) / 2;
		return (int) Math.round(Math.pow(phi, n) 
				/ Math.sqrt(5)); 
	}

	static int fibDPTabulation(int n) {
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
		int i; 

		/* 0th and 1st number of the series are 0 and 1*/
		f[0] = 0; 
		f[1] = 1; 

		for (i = 2; i <= n; i++) 
		{ 
			/* Add the previous 2 numbers in the series 
		and store it */
			f[i] = f[i-1] + f[i-2]; 
		} 

		return f[n]; 
	} 

	static int fibDPMemoization(int n) {
		if (lookupTableForDPMemoization[n] == NIL) {
			if (n <= 1) 
				lookupTableForDPMemoization[n] = n; 
			else
				lookupTableForDPMemoization[n] = fibDPMemoization(n-1) + fibDPMemoization(n-2); 
		} 
		return lookupTableForDPMemoization[n];
	} 

	static void _initialize(int[] lookupTable, int val) {
		for (int i = 0; i < MAX; i++) 
			lookupTable[i] = val;
	}

	static int fib(int n) {
		int a = 1;
		int b = 1;
		int c;
		if (n == 0) {
			return 0;
		}
		for (int i = 1; i <= n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	static int fibRecursive(int n) {
		if(n == 0 || n ==1)
			return n;
		else {
			int fib = fibRecursive(n - 1) + fibRecursive(n - 2);
			return fib;
		}
	}

	static int fibTailRecursive(int n, int a, int b) {
		if (n == 0) 
			return a; 
		if (n == 1) 
			return b; 
		return fibTailRecursive(n - 1, b, a + b); 
	}

}
