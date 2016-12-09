package effectiveJava;


//Item 1: Consider static factory methods instead of constructors
public class EffectiveJava1 {
	
	public static void main(String[] args) {
		boolean flag = true;
		if(Boolean.TRUE.equals("true")){
			System.out.println(" passed the condition");
		}
		else {
			System.out.println("Failed the condition");
		}
	}
	

}
 