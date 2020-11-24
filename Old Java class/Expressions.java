package edu.centuty.stacks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Expressions {

	private Stack<Character> operations;
	private Stack<Integer> operands;
	public static final Pattern UNSIGNED_INT = Pattern.compile("[0-9]+");
	public static final Pattern CHARACTER = Pattern.compile("[- + * /]");
	public static final char PLUS = '+';
	public static final char MINUS = '-';
	public static final char DIVIDE = '/';
	public static final char MULTIPLY = '*';

	public Expressions() {
		operations = new Stack<>(10);
		operands = new Stack<>(10);
	}

	public void prefix(String expr) {

		Scanner input = new Scanner(expr);

		while (input.hasNext()) {
			String next = input.next();
			Object obj = findType(next);

			if (obj instanceof Character) {
				operations.push((Character) obj);
			} else if (obj instanceof Integer) {

				operands.push((Integer) obj);

				if (operands.size() >= 2) {
					int result = evaluate();
					operands.push(result);
				}

			}

		}
		
		System.out.println("Result: " + operands.pop());
		input.close();
	}

	private int evaluate() {
		char operator = operations.pop();
		int rightOp = operands.pop();
		int leftOp = operands.pop();

		int result = 0;
		switch (operator) {
		case PLUS:
			result = leftOp + rightOp;
			break;
		case MINUS:
			result = leftOp - rightOp;
			break;
		case MULTIPLY:
			result = leftOp * rightOp;
			break;
		case DIVIDE:
			result = leftOp / rightOp;
			break;
		default:
			result = 0;
		}

		return result;
	}

	public Object findType(String next) {

		Scanner tmp = new Scanner(next);

		Object obj = null;

		if (tmp.hasNext(UNSIGNED_INT)) {

			obj = new Integer(tmp.nextInt());
		} else {

			obj = new Character(next.charAt(0));
		}

		tmp.close();

		return obj;

	}
	
	public static void main(String[] args) {
		Expressions exp = new Expressions();
		exp.prefix("+ - + 4 3 5 2");
		
	}

}
