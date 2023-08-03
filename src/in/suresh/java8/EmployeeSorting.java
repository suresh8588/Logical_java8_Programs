package in.suresh.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private String gender;
	private String dept;

	public Employee() {
		// System.out.println("Default Constuctor :: Employee");
	}

	public Employee(Integer id, String name, Double salary, String gender, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.dept = dept;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", dept=" + dept
				+ "]";
	}

}

public class EmployeeSorting {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Suresh", 55000.00, "Male", "Manager");
		Employee e2 = new Employee(2, "Nandini", 5000.00, "Fe-Male", "Sales");
		Employee e3 = new Employee(3, "Naresh", 15000.00, "Male", "Admin");
		Employee e4 = new Employee(4, "Praveen", 25000.00, "Male", "Marketing");
		Employee e5 = new Employee(5, "Anvitha", 35000.00, "Fe-Male", "Account");
		Employee e6 = new Employee(6, "Raju", 45000.00, "Male", "HR");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6);

		List<Double> list2 = list.stream().map(Employee::getSalary).filter(i -> i > 25000.00)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);

		/*
		 * List<Employee> emps = Arrays.asList(e1, e2, e3, e4, e5, e6); List<String>
		 * listEmployee =
		 * emps.stream().map(Employee::getName).sorted((Comparator.reverseOrder()))
		 * .collect(Collectors.toList()); listEmployee.forEach(System.out::println);
		 */

	}
}
