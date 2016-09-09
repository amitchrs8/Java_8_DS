package java_8_only;

import java.util.ArrayList;
import java.util.List;

public class FooFlatMap {

	String name;

	List<BarFlatMap> listBars = new ArrayList<>();

	public FooFlatMap(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FooFlatMap [name=");
		builder.append(name);
		builder.append(", listBars=");
		builder.append(listBars);
		builder.append("]");
		return builder.toString();
	}

}
