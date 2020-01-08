public class Employee {
	int id, salary;
	String name;
	Employee(){}
	Employee(int iId, String iName , int iSalary) {
		this.id = iId;
		this.salary = iSalary;
		this.name = iName;
	}
	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + salary);
	}
}