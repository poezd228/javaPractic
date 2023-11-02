public class GenericArray<T> {
    private Object[] array; // Используем массив Object для хранения элементов любого типа




    public GenericArray(int size) {
        array = new Object[size]; // Инициализация массива
    }

    public void set(int index, T item) {
        array[index] = item; // Добавление элемента в массив
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index]; // Извлечение элемента с приведением типа
    }

    public int length() {
        return array.length; // Получение размера массива
    }

    // Вспомогательный метод для создания GenericArray для данного типа и размера
    public static <E> GenericArray<E> of(Class<E> clazz, int size) {
        return new GenericArray<>(size);
    }
}
