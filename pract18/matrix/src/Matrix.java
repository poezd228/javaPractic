public class Matrix<T extends Number> {
    private T[][] data;

    public boolean dataToString(){
        System.out.println("==============");
        for (T[] row : data) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }
        return false;
    }

    public Matrix(T[][] data) {
        this.data = data;
    }

    public Matrix<T> add(Matrix<T> other) throws IllegalArgumentException {
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices sizes must be equal.");
        }

        T[][] result = (T[][]) new Number[this.data.length][this.data[0].length];

        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                result[i][j] = (T) Double.valueOf(this.data[i][j].doubleValue() + other.data[i][j].doubleValue());
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) throws IllegalArgumentException {
        if (this.data[0].length != other.data.length) {
            throw new IllegalArgumentException("Matrices sizes are not compatible for multiplication.");
        }

        T[][] result = (T[][]) new Number[this.data.length][other.data[0].length];

        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                double sum = 0.0;
                for (int k = 0; k < this.data[0].length; k++) {
                    sum += this.data[i][k].doubleValue() * other.data[k][j].doubleValue();
                }
                result[i][j] = (T) Double.valueOf(sum);
            }
        }

        return new Matrix<>(result);
    }

    public T[][] getData() {
        return data;
    }

    // Дополнительные методы (например, вывод матрицы) могут быть реализованы здесь...
}
