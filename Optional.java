import java.util.Optional;

public class Optional {

	public static void main(String[] srgs) {
        Integer i = null;
        Integer j = 47;
		Optional<Integer> var1 = Optional.ofNullable(i);
		Optional<Integer> var2 = Optional.of(j);
		System.out.println(var1.orElse(2));
		
	}

}

