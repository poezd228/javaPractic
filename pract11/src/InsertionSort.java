public class InsertionSort {

    private int[] array = new int[0];


    public void SetArr(int[] arr) {
        array = arr;

    }

    public int[] GetArr() {
        return array;
    }


    // Функция сортировки вставками
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Перемещение элементов arr[0..i-1], которые больше,
               чем key, на одну позицию вперед от их текущего положения */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        array = arr;
    }

    // Вспомогательная функция для вывода массива на экран
    public void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
