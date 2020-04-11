
public class MethodsFactorial {

	public static void main(String[] args) {

		for (int number = 1; number <= 9; number++) {
			int factorial = factorial(number);
			System.out.println(number + "! = " + factorial);
		}

	}

	private static int factorial(int x) {
		int factorial = 1;
		for (int i = x; i >= 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
