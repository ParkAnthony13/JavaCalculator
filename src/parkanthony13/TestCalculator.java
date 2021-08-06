package parkanthony13;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.setOperandOne(10.5);
		test.setOperandTwo(5.2);
		test.setOperation("+");
		System.out.println(test.performOperation());

	}

}
