package ef.main.java.org.effectivejava.examples.chapter02.item05.fastversion;

// Doesn't creates unnecessary duplicate objects - page 21

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/**
 *  静态 初始一些不必要重复的数值
 * @author hou
 *
 */
class Person {
	private final Date birthDate;

	public Person(Date birthDate) {
		// Defensive copy - see Item 39
		this.birthDate = new Date(birthDate.getTime());
	}

	// Other fields, methods

	/**
	 * The starting and ending dates of the baby boom.
	 */
	private static final Date BOOM_START;
	private static final Date BOOM_END;

	static {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0
				&& birthDate.compareTo(BOOM_END) < 0;
	}

	public static void main(String[] args) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
				.parse("1947-07-29 10:52:00");
		Person person = new Person(date);
		System.out.println(person.isBabyBoomer());
	}
}
