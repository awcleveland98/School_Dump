package edu.centuty.stacks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CalcExpressions {

	private GenericStackLinkedList<Character> operations;
	private GenericStackLinkedList<Integer> operands;
	public static final Pattern UNSIGNED_INT = Pattern.compile("[0-9]+");
	public static final Pattern OP = Pattern.compile("[+ - * / %]");
	public static final int FIRST_CHAR = 0;
	public static final char PLUS = '+';
	public static final char MINUS = '-';
	public static final char MULTIPLY = '*';
	public static final char DIVIDE = '/';

	public CalcExpressions() {
		operands = new GenericStackLinkedList<>();
		operations = new GenericStackLinkedList<>();
	}

	public void prefix(String expr) {

		if (expr == null)
			throw new IllegalArgumentException("expression is : " + expr);

		Scanner input = new Scanner(expr);

		while (input.hasNext()) {

			Object obj = findType(input.next());

			if (obj instanceof Character) {
				operations.push((Character) obj);
			} else if (obj instanceof Integer){

				operands.push((Integer) obj);
				
				if (operands.size() >= 2) {
					int result = performCal();

					operands.push(result);
				}
			}
		}

		System.out.println("Result : \n" + operands.peek());

		input.close();
	}

	public Object findType(String next) {

		Scanner tmp = new Scanner(next);
		Object obj = null;

		if (tmp.hasNext(UNSIGNED_INT)) {

			obj = new Integer(tmp.nextInt());
		} else {

			obj = new Character(next.charAt(FIRST_CHAR));
		}

		tmp.close();

		return obj;

	}

	private int performCal() {
		
		char op = operations.pop();
		
		int rightOp = operands.pop();
		
		System.out.println("Pop: " + rightOp + "\n" + operands.toString());
		
		int leftOp = operands.pop();
		System.out.println("Pop: " + leftOp + "\n" + operands.toString());
		int result = 0;

		switch (op) {
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
			result = -1;
			break;
		}

		return result;
	}

	public static void main(String[] args) {
		CalcExpressions exp = new CalcExpressions();
		exp.prefix("+ - + * / 1 2 6 4 3 8");
	}
}
