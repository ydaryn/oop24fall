package pr52;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter expressions: ");
        String inputLine = in.nextLine();

        StringTokenizer expressionTokenizer = new StringTokenizer(inputLine, " ");

        while (expressionTokenizer.hasMoreTokens()) {
            String expression = expressionTokenizer.nextToken();

            StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

            try {
                String leftString = tokenizer.nextToken();
                String operator = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand = Double.parseDouble(leftString);
                double rightOperand = Double.parseDouble(rightString);
                double result = 0.0;

                if (operator.equals("+")) {
                    result = leftOperand + rightOperand;
                } else if (operator.equals("-")) {
                    result = leftOperand - rightOperand;
                } else if (operator.equals("*")) {
                    result = leftOperand * rightOperand;
                } else if (operator.equals("/")) {
                    if (rightOperand != 0) {
                        result = leftOperand / rightOperand;
                    } else {
                        System.out.println("Division by zero in expression: " + expression);
                        continue;
                    }
                } else {
                    System.out.println("Unsupported operator in expression: " + expression);
                    continue;
                }

                System.out.println("Result of " + expression + " = " + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax in expression: " + expression);
            } catch (NumberFormatException nfe) {
                System.out.println("One or more operands is not a number in expression: " + expression);
            }
        }
    }
}
