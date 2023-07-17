package in.suresh.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		empList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 34500.0));
		empList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		empList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		empList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 32000.0));
		empList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		empList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		empList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		empList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		empList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		empList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		empList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList()).forEach(System.out::println);
	}
}

class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}
