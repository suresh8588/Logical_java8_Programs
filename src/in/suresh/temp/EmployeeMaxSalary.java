package in.suresh.temp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMaxSalary {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Suresh", 15000.00);
		Employee e2 = new Employee(102, "Ramesh", 25000.00);
		Employee e3 = new Employee(103, "Naresh", 10000.00);
		Employee e4 = new Employee(104, "Praveen", 45000.00);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4);
		Optional<Employee> maxSal = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));

		System.out.println(maxSal.get());
	}
}

class Employee {

	int id;
	String name;
	Double salary;

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}