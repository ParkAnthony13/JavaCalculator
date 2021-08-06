package parkanthony13;

public class Calculator implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	
	public double performOperation() {
		if (getOperation().equals("+")) {
			setResults(getOperandOne()+getOperandTwo());
		} else if (getOperation().equals("-")) {
			setResults(getOperandOne()-getOperandTwo());
		}
		return getResults();
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}
	
	

}
