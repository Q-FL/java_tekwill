public class EX12_5 {
	public static void main(String[] args) {
		String str = "welllcommmmeee";
		System.out.println(triplets(str));
		str = "it is a string";
		System.out.println(isReplace(str));
		str = "ab5c2d4ef12s";
		System.out.println(sumDigitString(str));
	}
	static int triplets(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-2; i++){
			if (str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2))
				count++;
		}
		return count;
	}
	static String isReplace(String str) {
		str = str.replace("is","is not");
		return str;
	}
	static int sumDigitString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length();i++){
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		return sum;
	}
}