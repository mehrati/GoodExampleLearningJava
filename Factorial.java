public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));

	}

	public static int factorial(int a) {

		if (a != 1) {

			return a * factorial(--a);
		} else {
			return 1;
		}

	}

}

