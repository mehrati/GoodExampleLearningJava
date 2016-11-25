import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadAllLines {

	public static void main(String[] srgs) throws IOException {

		Path path = Paths.get("Note.txt");
		System.out.println(Files.exists(path));
		List<String> lines= Files.readAllLines(path);
		Iterator<String> string = lines.iterator();
		while(string.hasNext()){
			System.out.println(string.next());
		}
		System.out.println(Files.isWritable(path));
		System.out.println(Files.size(path));
	}

}

