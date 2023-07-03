package in.suresh.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNameLenthAndName {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "Jhon", "Charles");
		
		
		//Approach - 1
		
		list.stream().filter(n->n.startsWith("A")).map(name->name+" -"+name.length()).forEach(i->System.out.println(i));
		
		//Approach - 2
		List<String> collect = list.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		collect.forEach(i->System.out.println(i+" - "+i.length()));
			
		}

}
