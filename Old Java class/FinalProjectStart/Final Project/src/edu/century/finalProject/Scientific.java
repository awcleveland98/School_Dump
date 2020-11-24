package edu.century.finalProject;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Scientific {

	private ArrayStack<Character> operations;
	private ArrayStack<String> operations2;
	private ArrayStack<Double> operands;
	public static final Pattern UNSIGNED_DOUBLE = Pattern.compile("[0-9]+");
	public static final Pattern CHARACTER = Pattern.compile("[- + * / %]");
	public static final Pattern STRING = Pattern.compile("[Sin Cos Tan ASin ACos ATan \u221A Cbrt Log Ln \u03C0 e x^y x^2 x^3 |x| e^x x! 1/x]");
	public static final char PLUS = '+';
	public static final char MINUS = '-';
	public static final char DIVIDE = '/';
	public static final char MULTIPLY = '*';
	public static final char PERCENTAGE = '%';
	public static final String SINE = "Sin";
	public static final String COSINE = "Cos";
	public static final String TANGENT = "Tan";
	public static final String ARCSIN = "ASin";
	public static final String ARCCOSINE = "ACos";
	public static final String ARCTANGENT = "ATan";
	public static final String SQUAREROOT = "\u221A";
	public static final String CUBEROOT = "Cbrt";
	public static final String LOG = "Log";
	public static final String LN = "Ln";
	public static final String PI = "\u03C0";
	public static final String EULER = "e";
	public static final String POWER = "x^y";
	public static final String SQUARED = "x^2";
	public static final String CUBED = "x^3";
	public static final String ABSOLUTE = "|x|";
	public static final String EULERPOWER = "e^x";
	public static final String FACTORIAL = "x!";
	public static final String FRACTION = "1/x";
	
	public Scientific() {
		operations = new ArrayStack<>(10);
		operations2 = new ArrayStack<>(10);
		operands = new ArrayStack<>(10);
	}
	
	public void prefix(String expr) {

		Scanner input = new Scanner(expr);

		while (input.hasNext()) {
			String next = input.next();
			Object obj = findType(next);

			if (obj instanceof Character) {
				operations.push((Character) obj);
			}
			else if (obj instanceof String) {
				operations2.push((String) obj);
			}
			else if (obj instanceof Double) {

				operands.push((Double) obj);

				if (operands.size() >= 2) {
					double result = evaluate();
					operands.push(result);
				}

			}

		}

		System.out.println(operands.pop());
		input.close();
	}
	
	private double evaluate() {
		char operator = operations.pop();
		String operator2 = operations2.pop();
		double rightOp = operands.pop();
		double leftOp = operands.pop();

		double result = 0;
		switch (operator) {
			case PLUS :
				result = leftOp + rightOp;
				break;
			case MINUS :
				result = leftOp - rightOp;
				break;
			case MULTIPLY :
				result = leftOp * rightOp;
				break;
			case DIVIDE :
				result = leftOp / rightOp;
				break;
			case PERCENTAGE :
				result = leftOp / 100;
				break;
			default :
				result = 0;
		}
		switch (operator2) {
			case SINE :
				result = Math.sin(rightOp);
				break;
			case COSINE :
				result = Math.cos(rightOp);
				break;
			case TANGENT :
				result = Math.tan(rightOp);
				break;
			case ARCSIN :
				result = Math.asin(rightOp);
				break;
			case ARCCOSINE :
				result = Math.acos(rightOp);
				break;
			case ARCTANGENT :
				result = Math.atan(rightOp);
				break;
			case SQUAREROOT :
				result = Math.sqrt(rightOp);
				break;
			case CUBEROOT :
				result = Math.cbrt(rightOp);
				break;
			case LOG :
				result = Math.log(rightOp);
				break;
			case LN :
				result = (-Math.log(1 - rightOp)) / rightOp;
				break;
			case PI :
				result = Math.PI;
				break;
			case EULER :
				result = Math.E;
				break;
			case POWER :
				result = Math.pow(leftOp, rightOp);
				break;
			case SQUARED :
				result = Math.pow(leftOp, 2);
				break;
			case CUBED :
				result = Math.pow(leftOp, 3);
				break;
			case ABSOLUTE :
				result = Math.abs(rightOp);
				break;
			case EULERPOWER :
				result = Math.pow(Math.E, rightOp);
				break;
			case FACTORIAL :
				
			case FRACTION :
				result = 1 / rightOp;
				break;
			default : 
				result = 0;
		}

		return result;
	}

	public Object findType(String next) {

		Scanner tmp = new Scanner(next);

		Object obj = null;

		if (tmp.hasNext(UNSIGNED_DOUBLE)) {

			obj = new Integer(tmp.nextInt());
		}
		else if (tmp.hasNext(CHARACTER)) {

			obj = new Character(next.charAt(0));
		}
		else {
			
			obj = new String(tmp.next());
		}

		tmp.close();

		return obj;

	}
	
	public static void main(String[] args) {
		Scientific exp = new Scientific();
		exp.prefix("5 + 2");

	}
	
}
