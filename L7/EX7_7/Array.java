import java.util.Arrays;
public class Array {
	int items[] = {4,2,3,6,9};
	void itemsInfo() {
		System.out.println("Items in array: " + Arrays.toString(items));
	}
	void sum(){
		int vSum = 0;
		for (int oneD = 0; oneD < items.length; oneD++) {
			vSum += items[oneD];
		}
		System.out.println("Sum: " + vSum);
	}
	void average(){
		int vSum = 0;
		int vElm = 0;
		for (int oneD = 0; oneD < items.length; oneD++) {
			vSum += items[oneD];
			vElm++;
		}
		System.out.println("Average: " + (vSum / vElm));
	}
	void even(){
		System.out.print("Even Numbers: ");
		for (int oneD = 0; oneD < items.length; oneD++) {
			if (items[oneD] % 2 == 0) {
				System.out.print(items[oneD] + " ");
			}
		}
	}
	void odd(){
		System.out.print("\nOdd Numbers: ");
		for (int oneD = 0; oneD < items.length; oneD++) {
			if (items[oneD] % 2 != 0) {
				System.out.print(items[oneD] + " ");
			}
		}
	}
	void length(){
		System.out.print("\nArray length: " + items.length);
	}
}