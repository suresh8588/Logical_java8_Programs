package in.suresh.streams.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(1, "suresh", 80, "English", "Male"));
		list.add(new Student(2, "naresh", 60, "Telugu", "Male"));
		list.add(new Student(3, "Navitha", 60, "English", "Fe-Male"));
		list.add(new Student(4, "Akira", 90, "English", "Fe-Male"));
		list.add(new Student(5, "praveen", 80, "Maths", "Male"));
		list.add(new Student(6, "prasad", 50, "Maths", "Male"));
		
		List<String> list2 = list.stream().filter(s->s.getSubject().equals("English") && s.getMarks()>70).map(s->s.getName()+" "+s.getMarks()).collect(Collectors.toList());
		System.out.println(list2);
	}
}
