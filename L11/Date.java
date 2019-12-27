public class Date {
	private int day,mounth,year;
	Date(int iDay,int iMounth,int iYear){
		if (0 < iDay && iDay <= 31) this.day = iDay;
		else System.out.println("Wrong input: Day");
		if (0 < iMounth && iMounth <= 12) this.mounth = iMounth;
		else System.out.println("Wrong input: Mounth"); 
		if (0 < iYear) this.year = iYear;
		else System.out.println("Wrong input: Year");
	}
	void displayDate() {
		System.out.println(this.day + "/" + this.mounth + "/" + this.year);
	}
}