import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] srgs) {

		List<String> names = new ArrayList<>();
		names.add("mahdi");
		names.add("ali");
		names.add("gholi");
		names.add("Gala");
		names.add("Mals");
		Consumer<String> consumer = System.out::printf;
		names.forEach(consumer);
		
	}

}

