package Employee;

public class Employee {
	int id;
	int salary;
	String name;
	Employee(int id, int salary,String name){
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public void updateSalary(int salary) {
		this.salary = salary;
	}
	
	public void updateID(int id) {
		this.id = id;
	}
	
	public void updateName(int id) {
		this.id = id;
	}
	public void view() {
		System.out.println("id: " + id + " salary: " + salary + " name: " + name);
	}
}
