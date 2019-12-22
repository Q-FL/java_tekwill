public class EX10_5 {
	public static void main(String[]Strings){
		System.out.print("Pow: " + integerPower(5,-3));
	}
	static double integerPower(int base,int exponent){
		int base_multip = base;
		if (exponent > 0) {
			int i = 1;
			while (i<exponent){
				base*=base_multip;
				i++;
			}
			return (double) base;
		}
		if (exponent < 0) {
			int i = -1;
			while (i > exponent){
				base*=base_multip;
				i--;
			}
			return (double) 1 / base;
		}
		else
			return (double) 1;
	}
}