package misc;


@FunctionalInterface
public interface Formula {
	
	double divide(int dividend, int divisror);
	default double sqrt(double number){
		return Math.sqrt(number);
	}

}
