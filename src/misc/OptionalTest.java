package misc;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		String testVal = null;
		Optional<String> strOpt = Optional.ofNullable("null");
		System.out.println("value of strOpt ");
		String defaultval = "default value";
		defaultval = strOpt.orElse(defaultval).toString();
		System.out.println("default value is : "+defaultval);
		
		System.out.println("Number of processors >> "+Runtime.getRuntime().availableProcessors());
		System.out.println("Free Memory >> "+Runtime.getRuntime().freeMemory());
		System.out.println("Max Memory >> "+Runtime.getRuntime().maxMemory());
		System.out.println("Total Memory >> "+Runtime.getRuntime().totalMemory());
//		strOpt.ifPresent(System.out :: println);
	}
	
}
