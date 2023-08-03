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

	//1. How many male and female employees are there in the organization ?
		Map<String, Long> count = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("1. How many male and female employees are there in the organization "+count);
	
	//2. Print the name of all departments in the organization ?
		empList.stream().map(e->e.getDepartment()).distinct().forEach(e->System.out.println("2. Print the name of all departments in the organization ?"+e));
	
	
	//3. What is the average age of male and female employees ?
		Map<String, Double> map = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("3. What is the average age of male and female employees ?"+map);
	
	
	//4. Get the details of highest paid employee in the organization ?
		Employee employee = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
		System.out.println("4. Get the details of highest paid employee in the organization ?"+employee);
	
	//5. Get the names of all employees who have joined after 2015 ?
		 List<String> list = empList.stream().filter(e->e.yearOfJoining>2015).map(e->e.getName()).collect(Collectors.toList());
		 
		System.out.println("5. Get the names of all employees who have joined after 2015 ?"+list);
	
	//6. Count the number of employees in each department ?
		
		Map<String, Long> map2 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("6. Count the number of employees in each department ?"+map2);
	//7. What is the average salary of each department ?
		Map<String, Double> map3 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("7. What is the average salary of each department ?"+map3);
		
	//8. Get the details of youngest male employee in the Development department ?
		List<Employee> list2 = empList.stream().filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Development")).sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		System.out.println("8. Get the details of youngest male employee in the Development department ?"+list2.get(0));
	//9. Who has the most working experience in the organization ?
		Employee employee2 = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get();
		System.out.println( "9. Who has the most working experience in the organization ?"+employee2);
		
	//10. How many male and female employees are there in the Sales team ?
		Map<String, Long> collect = empList.stream().filter(e->e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("10. How many male and female employees are there in the Sales team ?"+collect);
		
	//11.  What is the average salary of male and female employees ?
		Map<String, Double> collect2 = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("11.  What is the average salary of male and female employees ?"+collect2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
