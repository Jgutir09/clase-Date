package es.unileon.prg.date;
public class MainDate {
	public static void main (String[] args){
		Date today;
		Date other;
		try{
			today = new Date(1,1,2017);
			other = new Date(5,5,2018);
			System.out.println(today.toString());
			System.out.println(other.toString());
			System.out.println(today.equals(other));
			System.out.println(today.SameDay(other));
			System.out.println(today.SameMonth(other));
			System.out.println(today.SameYear(other));	
			System.out.println(today.daysMonth(1));
			System.out.println(today.getSeasonName());
			System.out.println(today.daysTilDate());
			System.out.println(today.dateRandomWithWhile());
			System.out.println(today.dateRandomWithDoWhile());
			System.out.println(today.sameDaysMonths());
			System.out.println(today.daysTillEndOfYear());
			System.out.println(today.dWeek());
			
			
		}catch(DateException e){
			System.out.println(e.getMessage());
		}
	}
}
