import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {

	public static void main(String[] args) throws IOException {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numberOfTestCasesStr = br.readLine();
        Integer numberOfTestCases = Integer.parseInt(numberOfTestCasesStr);
        String inputs = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputs, " ");
        while (stringTokenizer.hasMoreTokens()) {
        	String inputStr = stringTokenizer.nextToken();
        	Integer input = Integer.parseInt(inputStr);
        	printSequence(input);
        }
	}
	
	private static void printSequence(Integer input) {
		for (int i = 1; i <= input; i++) {
			String toPrint = "" + i;
			boolean multipleOfThree = ((i % 3) == 0);
			boolean multipleOfFive = ((i % 5) == 0);
			if (multipleOfThree && !multipleOfFive) {
				toPrint = "Fizz";
			} else if (!multipleOfThree && multipleOfFive) {
				toPrint = "Buzz";
			} else if (multipleOfThree && multipleOfFive) {
				toPrint = "FizzBuzz";
			}
			System.out.println(toPrint);
		}
	}

}
