package in.suresh.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileData {

	public static void main(String[] args) throws Exception {

		FileReader fr= new FileReader("D:/A JFSD-23/CORE JAVA/notes/Multithreading.txt");

		BufferedReader bufferedReader =new BufferedReader(fr);
		List<String> list = bufferedReader.lines().collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
