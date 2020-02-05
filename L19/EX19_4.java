import java.util.*; 
import java.util.stream.IntStream;

public class EX19_4 {
	public static void main(String[] args) {
		try {
			System.out.println(divisibleBy7(6,5));
		} catch (InvalidRangeException e){
			System.out.println(e.getMessage());
		}
	}
	static int divisibleBy7(int min,int max) throws InvalidRangeException {
		if (min >= max)
			throw new InvalidRangeException();
		List<Integer> list = new ArrayList<>();
		IntStream.range(min,max).forEach(n -> {if (n % 7 == 0) list.add(n);});
		return list.size();
	}
}