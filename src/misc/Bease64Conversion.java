package misc;

import java.util.Base64;

public class Bease64Conversion {

	public static void main(String[] args) {
		String var =  "test:math";
		String encodedVal = Base64.getEncoder().encodeToString(var.getBytes());
		System.out.println(" plain value "+ var);
		System.out.println("encoded value "+encodedVal);
		char valSeperator = 7;
		String var3 = "systemLocation"+valSeperator+"Kolkata"+valSeperator;
		System.out.println(" value is "+var3);
	}
}
