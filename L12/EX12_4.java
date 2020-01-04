public class EX12_4{
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("abcdefg");
		str = str.append("12345");
		System.out.println(str);

		StringBuilder str2 = new StringBuilder("moon#night");
		System.out.println(str2.charAt(str2.indexOf("#")-1) == str2.charAt(str2.indexOf("#")+1));

		StringBuilder str3 = new StringBuilder("bat##ball");
		System.out.println(str3.charAt(str3.indexOf("#")-1) == str3.charAt(str3.indexOf("#")+3));

		StringBuilder str5 = new StringBuilder("welcome");
		for (int i=0; i < str5.length();i++){
			str5.insert(i+1,str5.charAt(i));
			i++;
		}
		System.out.println(str5);
	}
}