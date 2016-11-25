public class Overloading {

	public static void main(String[] srgs) {
		
		System.out.println(Calculate(2,4,4.6F));
		System.out.println(Calculate(2,4));
                System.out.println(Calculate(2));
	}

	public static float Calculate(int a, int b, float c) {
		return a + b + c;
	}

	public static float Calculate(int a, float b, int c) {
		return a + b + c;
	}

	static float Calculate(float a, int b) {
		return a + b;
	}
	
	static int Calculate(int a, int b) {
		return a + b;
	}

	static float Calculate(int a, float b) {
		return a + b;
	}

	static int Calculate(int a) {
		return a;
	}

	static float Calculate(float a) {
		return a;
	}
}

