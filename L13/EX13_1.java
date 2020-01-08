import java.util.ArrayList;
import java.util.Iterator;
public class EX13_1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 11; i++)
			list.add(i);

		print("Simple for loop:");
		for (int e = 0; e < list.size(); e++)
			print(list.get(e));

		print("Enhanced for loop:");
		for (int nr : list)
			print(nr);

		print("List Iterator:");
		Iterator<Integer> iter_list = list.listIterator();
		while (iter_list.hasNext())
			print(iter_list.next());

		print("While loop:");
		int count = 0;
		while(count < list.size()) {
			print(list.get(count));
			count++;
		}
	}
	static void print(String str){System.out.println(str);}
	static void print(int inte){System.out.println(inte);}
}