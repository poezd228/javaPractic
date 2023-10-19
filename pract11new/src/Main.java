import java.util.random.RandomGenerator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void mergeSort(Student[] students) {
        if (students == null || students.length <= 1) {
            return; // Нечего сортировать
        }

        int middle = students.length / 2;

        // Создаем два подмассива
        Student[] left = new Student[middle];
        Student[] right = new Student[students.length - middle];

        // Копируем данные в подмассивы
        System.arraycopy(students, 0, left, 0, middle);
        System.arraycopy(students, middle, right, 0, students.length - middle);

        // Рекурсивно сортируем подмассивы
        mergeSort(left);
        mergeSort(right);

        // Объединяем отсортированные подмассивы
        merge(students, left, right);
    }

    private static void merge(Student[] students, Student[] left, Student[] right) {
        int i = 0, j = 0, k = 0;

        // Сравниваем элементы и объединяем их в основной массив
        while (i < left.length && j < right.length) {
            if (left[i].getIDNumber() <= right[j].getIDNumber()) {
                students[k++] = left[i++];
            } else {
                students[k++] = right[j++];
            }
        }

        // Копируем оставшиеся элементы из левого подмассива (если есть)
        while (i < left.length) {
            students[k++] = left[i++];
        }

        // Копируем оставшиеся элементы из правого подмассива (если есть)
        while (j < right.length) {
            students[k++] = right[j++];
        }

    }

    public static void quickSortGPA(Student[] students, int low, int high) {
        if (low < high) {
            // Находим позицию опорного элемента (первого элемента)
            int pivotIndex = partition(students, low, high);

            // Рекурсивно сортируем элементы до и после опорного элемента
            quickSortGPA(students, low, pivotIndex - 1);
            quickSortGPA(students, pivotIndex + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        Student pivot = students[low];
        int left = low + 1;
        int right = high;

        while (true) {
            // Находим элемент, который больше или равен опорному элементу
            while (left <= right && students[left].getGPA() <= pivot.getGPA()) {
                left++;
            }

            // Находим элемент, который меньше или равен опорному элементу
            while (left <= right && students[right].getGPA() >= pivot.getGPA()) {
                right--;
            }

            // Если left и right пересеклись, то разбиение завершено
            if (left >= right) {
                break;
            } else {
                // Меняем элементы left и right местами
                Student temp = students[left];
                students[left] = students[right];
                students[right] = temp;
            }
        }

        // Меняем опорный элемент с элементом на позиции right
        Student temp = students[low];
        students[low] = students[right];
        students[right] = temp;

        return right;
    }


    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;


            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }

    }

    public static Student[] Merge(Student[] students1, Student[] students2) {
        Student[] students = new Student[students1.length + students2.length];

        for (int i = 0; i < students1.length; i++) {
            students[i] = students1[i];
        }
        for (int i = students1.length; i < students.length; i++) {
            students[i] = students2[i - students1.length];
        }
        return students;


    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student[] students2 = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students2[i] = new Student();
        }
        for (Student student : students) {
            student.setIDNumber(RandomGenerator.getDefault().nextInt(100));
            student.setGPA(RandomGenerator.getDefault().nextInt(100));
            System.out.println(student.getIDNumber() + " " + student.getGPA());
        }
        System.out.println("==========");

        for (Student student : students2) {
            student.setIDNumber(RandomGenerator.getDefault().nextInt(100));
            student.setGPA(RandomGenerator.getDefault().nextInt(100));
            System.out.println(student.getIDNumber() + " " + student.getGPA());
        }
        students = Merge(students, students2);

        mergeSort(students);
        //insertionSort(students);
        //quickSortGPA(students,0, students.length-1);
        System.out.println("id=GPA=====");


        for (Student student : students) {
            System.out.println(student.getIDNumber() + " " + student.getGPA());

        }


    }
}

