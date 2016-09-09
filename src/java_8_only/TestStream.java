package java_8_only;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class TestStream {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList();
		list1.add("test1");
		list1.add("test2");
		list1.add("test3");
		list1.add("retest1");
		list1.add("abtest1");
		list1.add("st1323");
		list1.add("value1");
		list1.add("temp");

		// System.out.println(list1.stream().findFirst());
		// System.out.println(list1.stream().count());
		// list1.stream().filter(s-> s.startsWith("te")).forEach(System.out ::
		// println);

//		Stream.of("d2", "a2", "b1", "b3", "c3").filter(s -> {
//			System.out.println("Filter is : " + s);
//			return s.startsWith("a");
//		}).map(s -> {
//			System.out.println("map : " + s);
//			return s.toUpperCase();
//		}).forEach(s -> System.out.println(" forEach : " + s));
//
//		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
//		myList.stream().filter(s -> s.startsWith("c") || s.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);

		
		Arrays.asList("dc3","a1","a2","b1","b2","b3","a3","c5").stream().findFirst().ifPresent(System.out :: println);
		
		
		IntStream.range(1, 312).forEach(System.out::println);
		System.out.println("Average is "+IntStream.range(121, 435).average());
		
		IntStream.range(23, 98844).average().ifPresent(System.out :: println);
		
		Arrays.stream(new int[]{21,32,43,5,54,65,6,56,3,6,56,5,65,64,6,45,64,64,56}).map(n-> n*3).forEach(System.out::println);
		Arrays.stream(new int[]{21,32,43,5,54,65,6,56,3,6,56,5,65,64,6,45,64,64,56}).map(n-> n*3).max().ifPresent(System.out::println);
		
		
		Stream.of(1.0,2.0,3.2).mapToInt(Double :: intValue).mapToObj(i-> "a"+i).forEach(System.out::println);
		
		Arrays.asList("dc3", "a1", "a2", "b1", "b2", "b3", "a3", "c5").stream().map(s -> {
			System.out.println("map : " + s);
			return s.toUpperCase();
		}).anyMatch(s -> {
			System.out.println("anyMatch : " + s);
			return s.startsWith("b");
		});
		
		Stream.of("e4","f4","dc3", "a1", "a2", "b1", "b2", "b3", "a3", "c5").sorted().filter(s-> {
			System.out.println(" filtering the value : "+s);
			return s.startsWith("a");
		}).sorted().map(s-> {
			System.out.println(" map is used : "+s);
			return s.toUpperCase();
		}).forEach(s-> System.out.println(" final value is "+s));
		
		
		
		Supplier<Stream<String>> streamSupplier =
			    () -> Stream.of("d2", "a2", "b1", "b3", "c","a22","a432","a32","2d3")
			            .filter(s -> s.startsWith("a"));

			streamSupplier.get().forEach(System.out::println);
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			streamSupplier.get().filter(s-> s.startsWith("a2")).forEach(System.out::println);;  
		
	}

}
