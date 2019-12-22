public class EX10_6 {
	public static void main(String[]Strings){
		System.out.println("20 4 " + isMultiple(20,4) + "\n");
		isMultipleSeries(20,4,10,3,45,3);
	}
	static boolean isMultiple(int base,int multiple) {
		if (base % multiple == 0)
			return true;
		else
			return false;
	}
	static void isMultipleSeries(int...series) {
		if (series.length % 2 == 0) {
			for (int nr = 0; nr<series.length; nr+=2) {
				if (series[nr] % series[nr+1] == 0)
					System.out.println(series[nr]+" "+series[nr+1] +" true");
				else
					System.out.println(series[nr]+" "+series[nr+1] +" false");
			}
		}
		else
			System.out.println("Series given missing a pair number !");
	}
}