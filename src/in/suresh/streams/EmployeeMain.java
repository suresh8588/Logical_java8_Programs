package in.suresh.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

// 1. How many male and female employees are there in the organization ?
		Map<String, Long> countMaleFemale = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("countMaleFemale: " + countMaleFemale);
// 2. Print the name of all departments in the organization
		empList.stream().map(e -> e.getDepartment()).distinct().forEach(e -> System.out.println(e));
// 3. What is the average age of male and female employees ?
		Map<String, Double> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Avarage age Male and Female : " + map);
// 4. Get the details of highest paid employee in the organization ?
		Optional<Employee> higestSalary = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("higestSalary : " + higestSalary);
// 5. Get the names of all employees who have joined after 2015 ?
		System.out.println("joined after 2015 :");
		empList.stream().filter(e -> e.getYearOfJoining() > 2015).map(e -> e.getName())
				.forEach(e -> System.out.println(e));
// 6. Count the number of employees in each department ?
		Map<String, Long> count = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Count no of employees in each dept :" + count);
// 7. What is the average salary of each department ?
		Map<String, Double> map2 = empList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Average Salary of each dept : " + map2);
// 8. Get the details of youngest male employee in the Development department ?
		Optional<Employee> collect = empList.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
				.collect((Collectors.minBy(Comparator.comparing(Employee::getAge))));
		System.out.println("Yongest MAle employee : " + collect);
// 9. Who has the most working experience in the organization ?
		Optional<Employee> mostExp = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining));
		System.out.println("Most Exp : " + mostExp);
// 10. How many male and female employees are there in the Sales team ?
		Map<String, Long> maleFemaleInSales = empList.stream().filter(e -> e.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("maleFemaleInSales :" + maleFemaleInSales);
		
		
		
		
		
// find 3rd highest salary
		Optional<Employee> thirdHighestSalary = empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct().skip(2).findFirst();
		System.out.println("Third Highest Salary : " + thirdHighestSalary);
		
		// find descending order by salary
		System.out.println();
		System.out.println("descending order by salary : ");
		List<Employee> list = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		
		// Print emp names in each dept
				System.out.println("=====================Approach 1===============");
				Map<String, List<String>> map1 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.mapping(Employee::getName, Collectors.toList())));

				for (Map.Entry<String, List<String>> e : map1.entrySet()) {
					System.out.println("Department : " + e.getKey());
					for (String value : e.getValue()) {
						System.out.println(value);
					}
					System.out.println();
				}

				System.out.println("=====================Approach 2===============");

				empList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((dept, employeeList) -> {
					System.out.println("Department : " + dept);
					
					for(Employee e: employeeList)
					System.out.println(e.getId()+" "+e.getName());
							
					System.out.println();
				});
		
		
		
		

		// 11. What is the average salary of male and female employees ?
		// 12. List down the names of all employees in each department ?

		// 13. What is the average salary and total salary of the whole organization ?

		// 14. Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years ?

		// 15. Who is the oldest employee in the organization?


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
