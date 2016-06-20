package misc;

public class MainFormula {

	public static void main(String[] args) {
		Formula fm = new FormulaImpl();
		System.out.println(" calculation : "+fm.divide(12233, 32));
		System.out.println("Default Sqrt : "+fm.sqrt(2123.432));

		//Use of Lambda expression to implement the Functional Interface
		Formula fmLambda = ( a, b)-> (a-b);
		System.out.println("lambda output : "+fmLambda.divide(12333, 333));
	
	}
	
}
