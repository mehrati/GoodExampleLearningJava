import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class IntSummaryStatistics {

	public static void main(String[] srgs) {

		List<Integer> li = Arrays.asList(29, 51, 40, 40, 83, 10, 34, 76);
		IntSummaryStatistics stats = li.stream().mapToInt(i->i).summaryStatistics();
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getAverage());
		System.out.println(stats.getSum());
	}

}

