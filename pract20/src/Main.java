import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static double calculate(String[] tokens) {
        Deque<Double> stack = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    // Важно сохранить порядок операндов
                    double subtractor = stack.pop();
                    double minuend = stack.pop();
                    stack.push(minuend - subtractor);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    // Важно сохранить порядок операндов
                    double divisor = stack.pop();
                    double dividend = stack.pop();
                    if (divisor == 0) throw new IllegalArgumentException("Cannot divide by zero.");
                    stack.push(dividend / divisor);
                    break;
                default:
                    // Добавляем число в стек
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid RPN expression.");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        // Пример вычисления выражения 5 1 2 + 4 * + 3 -
        String[] expression = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        double result = calculate(expression);
        System.out.println("The result of the expression is: " + result);
    }
}
