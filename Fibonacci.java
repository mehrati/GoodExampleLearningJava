public class Fibonacci {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++)
			System.out.print(fibonacci(i) + ", ");

	}

	public static int fibonacci(int i) {
		if (i == 0) {

			return 0;
		} else if (i == 1 || i == 2) {

			return 1;
		} else {

			return fibonacci(i - 1) + fibonacci(i - 2);
		}

	}

}

// F0 F1 F2 F3 F4 F5 F6 F7 F8 F9 F10 F11 F12 F13 F14 F15 F16 F17 F18 F19 F20
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181

