import java.util.ArrayList;
import java.util.Arrays;
public class EX13_7 {
	public static void main(String[] args) {
		System.out.println("\nEX13_7_3:");
		Employee emp0 = new Employee();
		Employee emp1 = new Employee(1,"Prikoke",5000);
		Employee emp2 = new Employee(2,"Johnny",3500);
		Employee emp3 = new Employee(3,"Koala",4000);
		Employee emp4 = new Employee(4,"Borris",1000);
		ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(emp0,emp1,emp2,emp3,emp4));

		Employee final_emp1 = searchId(empList,4);
		Employee final_emp2 = searchId(empList,999);
		final_emp1.getInfo();
		final_emp2.getInfo();

		System.out.println("\nEX13_7_4:");
		Employee emp0_c = new Employee();
		Employee emp1_c = new Employee(1,"Prikoke",5000);
		Employee emp2_c = new Employee(2,"Johnny",7777);
		Employee emp3_c = new Employee(3,"Koala",8999);
		Employee emp4_c = new Employee(4,"Borris",1000);
		ArrayList<Employee> empListTwo = new ArrayList<>(Arrays.asList(emp0_c,emp1_c,emp2_c,emp3_c,emp4_c));

		compareObj(empList,empListTwo);
	}
	static Employee searchId(ArrayList<Employee> array,int ids){
		for (Employee emp : array){
			if (emp.id == ids){
				return emp;
			}
		}
		return array.get(0);
	}
	static void compareObj(ArrayList<Employee> array_one, ArrayList<Employee> array_two){
		for (int object_index = 0; object_index < array_one.size();object_index++){
			if (
				(array_one.get(object_index)).name == (array_two.get(object_index)).name &&
				(array_one.get(object_index)).id == (array_two.get(object_index)).id &&
				(array_one.get(object_index)).salary == (array_two.get(object_index)).salary
				)
				System.out.println("Employee: " + (array_one.get(object_index)).name + " data match !");
			else
				System.out.println("Employee: " + (array_one.get(object_index)).name + " data dosen't match !");
		}
	}
}