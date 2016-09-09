package java_8_only;

import java.util.*;
import java.util.stream.Collectors;

public class TestAdvanceStream {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("amit", 25),
				new Person("rahul", 28), new Person("deepu", 25),
				new Person("yash", 15), new Person("ansh", 12));

//		List<Person> filteredList = list.stream().filter(p-> p.getName().startsWith("a")).collect(Collectors.toList());
//		System.out.println(filteredList);

		Map<Integer,List<Person>> mapGroupbyAge = list.stream().collect(Collectors.groupingBy(p-> p.getAge()));
		mapGroupbyAge.forEach((age,p)->{
			System.out.println("Age : "+age+" :: Person : "+p);
		});
		
		Double averageAge = list.stream().collect(Collectors.averagingInt(p-> p.getAge()));
		System.out.println("Average age : "+averageAge);
		
		
		IntSummaryStatistics summary = list.stream().collect(Collectors.summarizingInt(p-> p.getAge()));
		System.out.println(" Summary of Age of Persons : "+summary);
		System.out.println(" Max from sumary : "+summary.getMax());
		
		String phrase = list.stream().filter(p-> p.getAge()>18).map(p-> p.getName()).
				collect(Collectors.joining(" and ", "In India ", " are adult"));
		System.out.println(" Phrase ->>> : "+phrase);		
		
		
//		Map<Integer, String> map = list.stream().collect(Collectors.toMap(p->p.getAge(),p->p.getName(),(name1,name2)-> valueMapper))
		
		
		
	}

}
