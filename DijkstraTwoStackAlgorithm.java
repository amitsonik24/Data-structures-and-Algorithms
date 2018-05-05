package com.algorithms.main;

public class DijkstraTwoStackAlgorithm {

	static String expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
	static LIFOStack<Integer> operandStack = new LIFOStack<Integer>(Integer.class, 100);
	static LIFOStack<Character> operatorStack = new LIFOStack<Character>(Character.class, 100);

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < expression.length(); i++) {
			Character character = expression.charAt(i);
			if (character == ' ' || character == '(') {
				continue;
			} else {
				if (character == '+' || character == '-' || character == '*' || character == '/') {
					operatorStack.push(character);

				} else if (Character.isDigit(character)) {
					operandStack.push(character-'0');

				} else {
					Character operator = operatorStack.pop();
					int operand1 = operandStack.pop();
					int operand2 = operandStack.pop();
					int result = 0;
					if (operator == '+') {
						result = operand1 + operand2;
					} else if (operator == '-') {
						result = operand1 - operand2;
					} else if (operator == '*') {
						result = operand1 * operand2;
					} else {
						result = operand1 / operand2;
					}
                    operandStack.push(result);
				}
			}
		}
      System.out.println("THE ANSWER IS "+operandStack.pop());
		
		
	}

}
