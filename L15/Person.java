public class Person {
	private String name;
	private String address;

	Person(String iName,String iAddress) {
		this.name = iName;
		this.address = iAddress;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String iAddress) {
		this.address = iAddress;
	}
	public String toString() {
		return "Person: "+this.name+" "+this.address;
	}
}