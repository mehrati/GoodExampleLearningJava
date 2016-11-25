import java.util.Formatter;

public class Formatter {

	public static void main(String[] args) {

		Formatter f = new Formatter(System.out);
		f.format("Salam %s", "Donya ");
		f.close();

	}

}

