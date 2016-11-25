import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class removeIf_Method {

	public static void main(String[] args) {

		Predicate<Integer> predicate = i -> i >= 50;
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(26);
		l.add(31);
		l.add(42);
		l.add(53);
		l.add(16);
		l.add(22);
		l.add(43);
		l.add(64);
		l.add(75);
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			int y = it.next();
			if (predicate.test(y))
				it.remove();
		}
		// l.removeIf(predicate);

		System.out.println(l);
	}
}

