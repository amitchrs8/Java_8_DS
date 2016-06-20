package java_8_only;

public interface DefaultMethodIntf1 {
	
	void testMethod();
	default void testDefaultMethod(){
		System.out.println(" Defualt methof implementaion from Interface1");
	}

}
