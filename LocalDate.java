import java.time.*;

public class LD {
	public static void main(String[] args)
	{
		LocalDate date
			= LocalDate.parse("2018-12-31");
		
        System.out.println(isAfter(date));
		LocalDate returnvalue
			= date.plusMonths(9);
		System.out.println(returnvalue);
	}
}
