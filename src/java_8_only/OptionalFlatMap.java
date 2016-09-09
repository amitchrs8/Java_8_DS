package java_8_only;

import java.util.Optional;

public class OptionalFlatMap {

	static class Outer {
		Nested nested;

		public Outer(Nested nested) {
			super();
			this.nested = nested;
		}

	}

	static class Nested {
		Inner inner;

		public Nested(Inner inner) {
			super();
			this.inner = inner;
		}

	}

	static class Inner {
		public Inner(String name) {
			super();
			this.name = name;
		}

		String name;
	}

	public static void main(String[] args) {

		OptionalFlatMap.Outer outer = new OptionalFlatMap.Outer(new OptionalFlatMap.Nested(new OptionalFlatMap.Inner(
				"testing-Optional")));

//		OptionalFlatMap.Outer outer = new OptionalFlatMap.Outer(new OptionalFlatMap.Nested(null));

//		System.out.println(outer.nested.inner.name);

		Optional.of(outer).flatMap(o -> Optional.ofNullable(o.nested)).flatMap(n -> Optional.ofNullable(n.inner))
				.flatMap(i -> Optional.ofNullable(i.name)).ifPresent(System.out::println);
		System.out.println("At the end of File");
	}

}
