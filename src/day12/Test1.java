package day12;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {


		
		long times= System.currentTimeMillis();
		System.out.println(times);

		
		Date d1=new Date();
		
		System.out.println(d1);
		
		Date d2=new Date(0);
		System.out.println(d2);
		
		Date d3=new Date("2021/1/1 8:20:30");
		System.out.println(d3);
		
		Date d4=new Date(2021-1900, 1, 1);
		
		System.out.println(d4);
		
		System.out.println(d1.after(d2));
		
		System.out.println(d1.before(d2));
		
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d1));
		
		System.out.println(d1.equals(d2));
		
		Date d5=new Date();
		Date d6=new Date();
		System.out.println(d6.equals(d5));
		
		System.out.println(d1.getMonth());
		
		System.out.println(d1.getTime());
		

		d1.setYear(2020-1900);
		
		System.out.println(d1);
		
		
		System.out.println("===========");
		
		Calendar c1=Calendar.getInstance();
		
		System.out.println(c1);
		
		System.out.println(c1.get(Calendar.DATE));
		
		c1.add(Calendar.DATE, 1);
		
		System.out.println(c1.get(Calendar.DATE));
		
		c1.add(Calendar.DATE, -1);
		
		System.out.println(c1.get(Calendar.DATE));
		
		
		/*c1.clear();
		
		System.out.println(c1.get(Calendar.YEAR));*/
		
		c1.set(Calendar.DATE, 2);
		
		System.out.println(c1.get(Calendar.DATE));
		
		c1.set(2021, 1, 1);
		
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		
		System.out.println(c1.toString());
		
		Date d7=c1.getTime();
		System.out.println(d7);
		
		
		System.out.println("=================");
		
		Instant instant=Instant.now();
		System.out.println(instant);
		
		System.out.println(instant.get(ChronoField.MILLI_OF_SECOND));
		System.out.println(ZoneId.systemDefault());
		
		System.out.println("=================");
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		System.out.println(ld.getYear());
		System.out.println(ld.get(ChronoField.YEAR));
		
		//System.out.println(ld.get(ChronoField.HOUR_OF_DAY));
		
		
		ld=ld.plusDays(2);
		System.out.println(ld.toString());
		
		System.out.println("================");
		
		LocalTime t1=LocalTime.now();
		
		System.out.println(t1);
		
		System.out.println(t1.getHour());
		
		t1=t1.plusHours(1);
		
		System.out.println(t1);
		
		System.out.println("================");
		
		LocalDate l2=LocalDate.now();
		
		LocalDate l3=l2.plusDays(2);
		l3=l3.plusMonths(1);
		System.out.println(l2);
		System.out.println(l3);
		
		Period p=Period.between(l3, l2);
		
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
	}

}
