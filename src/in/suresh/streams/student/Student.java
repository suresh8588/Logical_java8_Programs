package in.suresh.streams.student;

public class Student {

	private Integer id;
	private String name;
	private Integer marks;
	private String subject;
	private String gender;
	
	
	public Student(Integer id, String name, Integer marks, String subject, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", subject=" + subject + ", gender="
				+ gender + "]";
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
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
