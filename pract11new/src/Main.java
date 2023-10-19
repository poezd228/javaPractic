import java.util.random.RandomGenerator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void MergeSort(Student[] students, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            MergeSort(students, l, m);
            MergeSort(students, m + 1, r);

            merge(students, l, m, r);
        }
    }

    public static void merge(Student[] students, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            students[i] = students[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = students[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i].getIDNumber() <= R[j].getIDNumber()) {
                students[k] = L[i];
                i++;
            } else {
                students[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            students[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            students[k] = R[j];
            j++;
            k++;
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

        public static void main(String[] args) {
            Student[] students = new Student[5];

            for (int i = 0; i < students.length; i++) {
                students[i] = new Student();
            }
            for (Student student : students) {
                student.setIDNumber(RandomGenerator.getDefault().nextInt(100));
                student.setGPA(RandomGenerator.getDefault().nextInt(100));
                System.out.println(student.getIDNumber() + " " + student.getGPA());
            }
            MergeSort(students,0, students.length-1);
            //insertionSort(students);
            //quickSortGPA(students,0, students.length-1);
            System.out.println("id=GPA=====");



            for (Student student : students) {
                System.out.println(student.getIDNumber() + " " + student.getGPA());

            }


        }
    }

