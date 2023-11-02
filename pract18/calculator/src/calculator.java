public class calculator {
    public static <T extends Number> double sum(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number> double multiply(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number> double divide(T x, T y) {
        if (y.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number> double subtraction(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }
}
