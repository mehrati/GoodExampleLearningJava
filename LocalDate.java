import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDate {

	public static void main(String[] srgs) {

		LocalDate today = LocalDate.now();
		LocalDate tommorow = today.plus(1, ChronoUnit.DAYS);
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Today : " + today);
		System.out.println("next Day : " + tommorow);
		System.out.println("next week : " + nextWeek);
		System.out.println("next month : " + nextMonth);
		System.out.println("next Year : " + nextYear);

	}

}

