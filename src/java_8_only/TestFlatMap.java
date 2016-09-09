package java_8_only;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TestFlatMap {

	public static void main(String[] args) {

		// Creating Foo Objects--
		List<FooFlatMap> listFoos = new ArrayList<>();

		IntStream.range(1, 4).forEach(i -> listFoos.add(new FooFlatMap("foo - " + i)));

		// Creating Bars------ Now we will iterate each Foo object and 3 Bar
		// object in the list of
		// BarObject of each Foo Object
		listFoos.stream().forEach(
				f -> IntStream.range(1, 4).forEach(
						i -> f.listBars.add(new BarFlatMap("bar - " + i + " Foo - " + f.name))));

		// FlatMap accepts a function which has to return a stream of objects.
		// So in order to resolve the bar objects of each foo, we just pass the
		// appropriate function:

		// listFoos.stream().flatMap(f-> f.listBars.stream()).forEach(b->
		// System.out.println(" printing the Bar "+b));

		// Another use of Flatmap and Stream--
		IntStream
				.range(1, 4)
				.mapToObj(i -> new FooFlatMap("Foo " + i))
				.peek(f -> IntStream.range(1, 4).mapToObj(i -> new BarFlatMap("Bar " + i + " " + f.name))
						.forEach(f.listBars::add)).flatMap(f -> f.listBars.stream())
				.forEach(b -> System.out.println(b));

	}

}
