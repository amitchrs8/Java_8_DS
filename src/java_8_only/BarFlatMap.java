package java_8_only;

public class BarFlatMap {

	String name;

	BarFlatMap(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BarFlatMap [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
