package com.logical;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		// How many male and female employees are there in the organization ?

		Map<String, Long> countMAleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMAleAndFemale);
		// 2. Print the name of all departments in the organization ?
		employeeList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

		// 3. What is the average age of male and female employees ?

		Map<String, Double> avgAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(e -> e.getAge())));
		System.out.println(avgAge);

		// 4. Get the details of highest paid employee in the organization ?

		Optional<Employee> maxSalary = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
		if (maxSalary.isPresent()) {
			System.out.println("Max Salary : " + maxSalary);
		}

		Optional<Employee> maxSal = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if (maxSal.isPresent()) {
			System.out.println("Max Sal : " + maxSal);
		}

		// 5. Get the names of all employees who have joined after 2015 ?

		List<Employee> after2015Employees = employeeList.stream().filter(e -> e.yearOfJoining > 2015)
				.collect(Collectors.toList());
		System.out.println("After 2015 Employee");
		after2015Employees.forEach(e -> System.out.println(e.name));

		// 6. Count the number of employees in each department ?

		Map<String, Long> departWiseEmpCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Depart Wise Emp Count: " + departWiseEmpCount);

		// What is the average salary of each department ?
		Map<String, Double> deptWiseAvgSalary = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(e -> e.salary)));
		System.out.println("deptWiseAvgSalary : " + deptWiseAvgSalary);

		Optional<Employee> thirdHighestSalry = employeeList.stream()
				.sorted((Comparator.comparing(Employee::getSalary).reversed())).skip(2).findFirst();
		System.out.println("Third Highest Salary :" + thirdHighestSalry);
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