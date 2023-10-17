import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] array = {22, 33, 12, 5, 3, 9};
        mergeSort list = new mergeSort();
        list.SetArr(array);
        list.quickSort(array, 0, array.length - 1);
        list.insertionSort(array);
        list.MergeSort(array, 0, array.length - 1);

        list.printArray(list.GetArr());


    }
}
