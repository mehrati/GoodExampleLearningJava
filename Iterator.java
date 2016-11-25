import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Iterator {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);

		Iterator<Integer> I = l.iterator();
		while (I.hasNext()) {

			System.out.println(I.next());
			I.remove();
		}
		for(Integer i : l){
			System.out.println(i);
		}

	}
}

