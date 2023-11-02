// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        minMax<Integer> minMax = new minMax<>(numbers);
        System.out.println("Min: " + minMax.min());
        System.out.println("Max: " + minMax.max());

        // Пример использования класса Calculator
        System.out.println("Sum: " + calculator.sum(10, 20));
        System.out.println("Multiply: " + calculator.multiply(10, 20));
        System.out.println("Divide: " + calculator.divide(10, 20));
        System.out.println("Subtraction: " + calculator.subtraction(10, 20));
        }
    }
