public class minMax<T extends Comparable<T>>{
    private T[] array;
    public minMax(T[] array){
        this.array = array;
    }
    public T min(){
        if (array == null || array.length == 0){
            return null;
        }
        T min = array[0];
        for (T element : array){
            if (element.compareTo(min)< 0){
                min = element;
            }
        }
        return min;
    }
    public T max() {
        if (array == null || array.length == 0) {
            return null; // или выбросить исключение
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }



}
