// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer[][] matrixData1 = {{1, 2}, {3, 4}};
        Integer[][] matrixData2 = {{5, 6}, {7, 8}};
        Matrix<Integer> matrix1 = new Matrix<>(matrixData1);
        Matrix<Integer> matrix2 = new Matrix<>(matrixData2);

        try {
            Matrix<Integer> sumResult = matrix1.add(matrix2);
            Matrix<Integer> productResult = matrix1.multiply(matrix2);
            System.out.println(sumResult.dataToString());
            System.out.println(productResult.dataToString());

            // Вывести результаты...
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
