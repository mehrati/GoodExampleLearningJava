
public class Enum {

	public static void main(String[] args) {
		Color red = Color.RED;
		Color blue = Color.valueOf("BLUE");
		Color[] colors = Color.values();
		System.out.println("RED equals BLUE =>" + red.equals(blue));
		System.out.println("Number Blue => " + blue.getNumber());
		for (Color color : colors) {
			System.out.println("Color =>" + color.name() + " Number =>" + color.getNumber());
		}
	}
}

enum Color {
	RED(1), BLUE(2), GREEN(3), GRAY(4), BLACK(5), YELLOW(6), WHITE(7);
	private int number;

	private Color(int var) {
		this.number = var;
	}

	public int getNumber() {
		return this.number;
	}
}
