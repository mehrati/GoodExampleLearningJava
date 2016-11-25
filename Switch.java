package mainpackage;

public class Switch {

	public static void main(String[] args) {
		
		switchChar('d');
	}

	public static void switchChar(char input) {
		switch (input) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			//break;
		default:
			System.out.println("none");
			break;
		}
	}

}

