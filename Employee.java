
public class Employee {
	String name;
	private int id;
	int salary;
	
	
	public Employee(String name,int id, int salary ) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	

	@Override
	public String toString() {
		return "Employee [" + name + "," + id + "," + salary + "]";
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
