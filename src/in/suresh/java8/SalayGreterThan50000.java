package in.suresh.java8;

import java.util.Arrays;
import java.util.List;

class Employee1 {

	String name;
	int age;
	double salary;

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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public Employee1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
public class SalayGreterThan50000 {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("Suresh", 30, 40000.00);
		Employee1 emp2 = new Employee1("Naresh", 32, 51000.00);
		Employee1 emp3 = new Employee1("Ramesh", 30, 55000.00);
		Employee1 emp4 = new Employee1("Balu", 30, 35000.00);

		List<Employee1> list = Arrays.asList(emp1, emp2, emp3, emp4);
		list.stream().filter(e -> e.getSalary() >= 50000.00).map(i -> i.name + "=" + i.salary)
				.forEach(i->System.out.println(i));
	}

}
