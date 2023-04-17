package calculateInString;
import java.util.ArrayList;

public class CalculateInString {
    public double calcuate(String equation) {
        double result = 0.0;
        String[] terms = equation.split(" ");
        
        ArrayList<Double> operands = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();

        for (int i = 0; i < terms.length; i++) {
            char term = terms[i].charAt(0);
            
            if (Character.isDigit(term)) {
                operands.add((double)(term - '0'));
            } else {
                operators.add(term);
            }
        }

        for (int i = 0; i < operators.size(); i++) {
            char operator = operators.get(i);

            switch (operator) {
                case '+':
                    result = operands.get(i) + operands.get(i + 1);
                    operands.set(i + 1, result);
                    break;
                case '-':
                    result = operands.get(i) - operands.get(i + 1);
                    operands.set(i + 1, result);
                    break;
                case '*':
                    result = operands.get(i) * operands.get(i + 1);
                    operands.set(i + 1, result);
                    break;
                case '/':
                    result = operands.get(i) / operands.get(i + 1);
                    operands.set(i + 1, result);
                    break;
                default:
                    break;
            }
        }

        return operands.get(operands.size() - 1);
    }
}