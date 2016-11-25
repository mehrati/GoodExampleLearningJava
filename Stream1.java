
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String... args) {

		List<Car> l = new ArrayList<>();
		l.add(new Car(2332, "Black"));
		l.add(new Car(1312, "Black"));
		l.add(new Car(2132, "Green"));
		l.add(new Car(2121, "Blue"));
		l.add(new Car(1232, "Red"));
		l.add(new Car(3342, "Blue"));
		Stream<Car> s = l.stream();
		// s.parallel();
		// Stream<Car> f =s.filter(a -> "Black".equals(a.color));
		// Stream<Car> f = s.limit(3);
		// Stream<Car> f = s.skip(3);
		Stream<String> f= s.map(a -> a.color); 
		f.forEach(a -> System.out.println(a));

	}

}

class Car {
	String color;
	int price;

	public Car(int price, String color) {
		this.price = price;
		this.color = color;
	}
}

