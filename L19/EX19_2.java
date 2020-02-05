import java.util.*;
public class EX19_2{
	public static void main(String[] args) {
		ListIntReader lir = new ListIntReader();
		int sum = lir.getList().stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
	
