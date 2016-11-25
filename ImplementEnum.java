public class ImplementEnum {

	public static void main(String[] args) {
		EnumColor b = EnumColor.RED;
		EnumColor r = EnumColor.RED;
		 System.out.println(b.equals(r));
	}
}

class EnumColor {

	public static final EnumColor RED = new EnumColor();
	public static final EnumColor BLUE = new EnumColor();
	public static final EnumColor GREEN = new EnumColor();
	public static final EnumColor BLACK = new EnumColor();
	public static final EnumColor GRAY = new EnumColor();
	public static final EnumColor YELLOW = new EnumColor();
	public static final EnumColor WHITE = new EnumColor();

	private EnumColor() {

	}

}
