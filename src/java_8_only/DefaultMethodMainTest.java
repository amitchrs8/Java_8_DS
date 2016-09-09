package java_8_only;

public class DefaultMethodMainTest {

	public static void main(String[] args) {

		DefaultMethodImpl1 dimpl1 = new DefaultMethodImpl1();
		dimpl1.testMethod();
		dimpl1.testDefaultMethod();
		((DefaultMethodIntf1)dimpl1).testDefaultMethod();
		
		DefaultMethodIntf1 dinf1 = new DefaultMethodImpl1();
		System.out.println("Calling default method on interface");
		dinf1.testDefaultMethod();
	}
	
}
