package co.in;
import java.time.LocalDate;
public class Localdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stubLocalDate ld=LocalDate.now();
	    LocalDate Local=LocalDate.now();
		System.out.println(ld.getMonth());//AUGUST
		System.out.println(ld.getMonthValue());//8
		System.out.println(ld.getDayOfMonth());//23
		System.out.println(ld.getDayOfYear());//235
		System.out.println(ld.getYear()); //2022
		System.out.println(ld.isAfter(ld));//false
		System.out.println(ld.isBefore(ld));//false
		System.out.println(ld.isEqual(ld));//true
		System.out.println(ld.getEra());  //CE
		System.out.println(ld.getChronology());//ISO
	}

}
