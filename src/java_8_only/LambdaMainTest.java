package java_8_only;

public class LambdaMainTest {

	public static void main(String[] args) {

		LambdaImpl limpl1 = new LambdaImpl();
		limpl1.displayMessage();

		LambdaIntf limpl2 = new LambdaIntf() {
			@Override
			public void displayMessage() {
				System.out.println(" from anonymous class of LambdaIntf");
			}
		};
		limpl2.displayMessage();

		LambdaIntf lintf2 = () -> System.out.println(" from Lambda expression");

		lintf2.displayMessage();

		LambdaIntfwithParam lintfParam1 = (String val) -> {
			System.out.println(" the value passed is : " + val);
			Integer value = null;
			try {
				value = Integer.parseInt(val);
			} catch (Exception ex) {
				System.out.println(" Exception occured during conversion of "
						+ val);
			}
			if (value != null) {
				System.out.println(" the square is : " + value * value);
			}
		};

		lintfParam1.printSquare("34j");

		LambdaIntfWithReturn lintf3 = (String input) -> {
			System.out.println(" the input passed is : " + input);
			StringBuffer bf = new StringBuffer(input);
			return bf.reverse().toString();
		};

		String reversString = lintf3.getReverse("testing");
		System.out.println(" REversed string is : " + reversString);
	}

}
