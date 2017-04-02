package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;

		if(month < 1 || month > 12){
			throw new DateException("Mes " + month + " no válido. Los valores posibles están entr el 1 y el 12");
		}else{
			this.month = month;
		}
		if(day >  daysMonth(getMonth()) || day < 1){

			throw new DateException("Día " + day + " no válido " + getMonthName(getMonth())+ "Sólo tiene"+ 
						daysMonth(getMonth())+" días.");
		}else{
			this.day = day;
		}

	}

//Gets
	public int getDay(){
			return day;
	}
	
	public int getMonth(){
			return month;
	}
	
	public int getYear(){
			return year;
	}
//Igual a
	public boolean equals (Date other){
			boolean Equals = false;
			
			if (getDay() == other.getDay() && getMonth() == other.getMonth() && getYear() == other.getYear()) {
				Equals = true;
			}
			return Equals;
			}
	public String toString(){
			return this.day +"/" +this.month +"/" + this.year;
	}

//Mismo día 
	public boolean SameDay(Date other){
		if (getDay() !=other.getDay () ){
			return false;
		}
		else{
			return true;
		}
	}
	
//Mismo mes
		public boolean SameMonth(Date other){
			if (getMonth() !=other.getMonth()){
				return false;
			}
			else{
				return true;
			}
		}

// Mismo año
		public boolean SameYear(Date other){
			if (getYear() != other.getYear()){
				return false;
			}
			else{
				return true;
			}
		}
//Nombre de los meses	
		public String getMonthName(int month){
			String monthname;
			switch(month){
				case 1:
					monthname = "Enero";
				break;
				case 2:
					monthname = "Febrero";
				break;
				case 3:
					monthname = "Marzo";
				break;
				case 4:
					monthname = "Abril";
					break;
				case 5:
					monthname = "Mayo";
					break;
				case 6:
					monthname = "Junio";
					break;
				case 7:
					monthname = "Julio";
					break;
				case 8:
					monthname = "Agosto";
					break;
				case 9:
					monthname = "Septiembre";
					break;
				case 10:
					monthname = "Octubre";
					break;
				case 11:
					monthname = "Noviembre";
					break;
				case 12:
					monthname = "Diciembre";
					break;
					
				default:
					monthname = "No existe ese mes";
			}
				return monthname;
		}
//Comprobar si el día del mes es correcto
		public boolean correctday (Date other){
			if(getDay() != other.getDay()){
			return false;
			}else{
				return true;
			}
		}
//Nombre de la estación por mayoría de días
		public String getSeasonName(){
			String seasonname;
			//invierno
			switch (getMonth()){
			case 1: //next
			case 2: //next
			case 3: 
				seasonname = "Invierno";
				break;
			//primavera
			case 4: //next
			case 5://next
			case 6: 
				seasonname = "Primavera";
				break;
			//verano
			case 7: //next
			case 8: //next
			case 9: //next
				seasonname = "Verano";
				break;
			//Otoño
			case 10: //next
			case 11: //next
			case 12: 
				seasonname = "Otoño";
				break;
			// Estación erronea
				default:
					seasonname = "No existe esa estación";
			}
					return seasonname; 
			
		}

//Días de los meses	
		public int daysMonth(int month){
			int numberdays;
			switch(month){
			//Días de Febrero
			case 2:
				numberdays = 31;
				break;
			//Meses con 31 días
			case 1: //next
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
				numberdays = 31;
				break;
			//Meses con 30 días
			case 4: //next
			case 6: //next
			case 9: //next
			case 11:
				numberdays = 30;
				break;
				default:
					numberdays = 0;
			}
					return numberdays;
		}
		
//Días hasta el final del año
		public String daysTillEndOfYear(){
			String leftd = " ";
			for(int i = getMonth(); i <= 12; i++){
					System.out.println(getMonthName(i));
			}
			return leftd;
		} 

//Imprimir una fecha.  
		public String Dated(){
			String dated;
			dated = getDay()+"/" +getMonth()+ "/"  + "/" + getYear();
			return dated;
		}
		
//Días hasta fin de mes
		public String EndMonth(){
			String endmonth = " ";
			for(int i = (getDay() + 1) ; i <= daysMonth(getMonth()); i++) {
				System.out.println(i);
			}
			return endmonth;
		}
		
//Meses con el mismo número de días hasta fin de año
		public String sameDaysMonths(){
		 String samedaysmonth = " ";
		 
		 for(int i = 1; i < getMonth(); i ++){
			 if(daysMonth(getMonth()) == daysMonth(i)){
				 System.out.println(getMonthName(i));
			 }
		 }
		 for(int i = (getMonth() + 1); i <= 12; i++){
			 if(daysMonth(getMonth()) == daysMonth(i)){
				 System.out.println(getMonthName(i));
			 }
		 }
		 	return samedaysmonth;
		}

//Días desde el primer día del año hasta fecha
		public int daysTilDate(){
			int ndays = 0;
			for(int i = 1; i < getMonth(); i ++){
				ndays = ndays + daysMonth(i);
			}
				ndays = ndays + getDay();
				return ndays;
		}
//Número de intentos desde fecha random hasta fecha		
		public int dateRandomWithWhile(){
			int ndays = 0, nmonths = 0, total = 0;
			
			while ((ndays != getDay()) && (nmonths != getMonth() ) ){
				ndays = (int) (Math.random()*31) + 1;
				nmonths= (int) (Math.random()*12) + 1;
				total++;
			}
			return total;
		}
//Número de intentos desde fecha random hasta fecha con do while
		public int dateRandomWithDoWhile(){
			int ndays = 0, nmonths = 0, total = 0;
			do{
				ndays = (int) (Math.random()*31) + 1;
				nmonths= (int) (Math.random()*12) + 1;
				total++;
			}
			while ((ndays != getDay()) && (nmonths != getMonth() ) );
			
			return total;
		}
//Día de la semana conociendo día.

		
		public String dWeek(){
			//mDay será el primer día del año. 
			int n, mDay;
			String dayWeek;

			mDay = 1;

			n = ((daysTilDate()  - mDay + 6)%7 );

			switch(n){
			case 0: 
				dayWeek = "Lunes";
				break;

			case 1:
				dayWeek = "Martes";
				break;

			case 2: 
				dayWeek = "Miércoles";
				break;

			case 3:
				dayWeek = "Jueves";
				break;

			case 4:
				dayWeek = "Viernes";
				break;

			case 5:
				dayWeek = "Sábado";
				break;

			case 6:
				dayWeek = "Domingo";
				break;

			default:
				dayWeek = "Introduzca otra fecha";
			}	
			return dayWeek;

		}
	}
//Este útlimo método se rompe a partir de Febrero pero no he conseguido arreglarlo.
