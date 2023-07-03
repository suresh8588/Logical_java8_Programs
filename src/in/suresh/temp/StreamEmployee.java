package in.suresh.temp;

import java.util.ArrayList;
import java.util.List;

public class StreamEmployee {

	
	public static void main(String[] args) {
		
		List<Employe> empList=new ArrayList<>();
		empList.add(new Employe(101, "Suresh", "28", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(102, "Ramesh", "26", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(103, "Smith", "24", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(104, "Jhon", "45", "MaFe-Malele", "Development", 2020,10000.00));
		empList.add(new Employe(105, "charls", "40", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(106, "Steve", "25", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(107, "Orlen", "21", "MalFe-Malee", "Development", 2020,10000.00));
		empList.add(new Employe(108, "Devid", "26", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(109, "Naresh", "30", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(110, "Praveen", "30", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(111, "Manoj", "40", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(112, "Ashok", "29", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(113, "Kevin", "21", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(114, "Purna", "15", "Fe-Male", "Development", 2020,10000.00));
		empList.add(new Employe(105, "Sri", "20", "Male", "Development", 2020,10000.00));
		empList.add(new Employe(106, "Kishore", "50", "Male", "Development", 2020,10000.00));

	
	}
}

class Employe{

	int id;
	String name;
	String age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
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
	public Employe(int id, String name, String age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
}
