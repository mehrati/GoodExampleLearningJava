public class Lamda {

	public static void main(String[] srgs) {

		Operation operation = (i, j) -> i + j;

		System.out.println(operation.plus(2, 3));
	}

}

@FunctionalInterface
interface Operation {
	int plus(int i, int j);
}

