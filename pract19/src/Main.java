import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        DirectoryContent directoryContent = new DirectoryContent("pract19/src/");
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.set(0, 123);

        GenericArray<String> strArray = GenericArray.of(String.class, 5);
        strArray.set(0, "Hello, World!");

        String[] stringArray = {"Apple", "Banana", "Cherry"};
        Integer[] integerArray = {1, 2, 3, 4, 5};
        ArrayToListConverter arrayToListConverter = new ArrayToListConverter();

        List<String> stringList = arrayToListConverter.convertArrayToList(stringArray);
        List<Integer> integerList = arrayToListConverter.convertArrayToList(integerArray);

        System.out.println("List of Strings: " + stringList);
        System.out.println("List of Integers: " + integerList);

        System.out.println("=======================");

        for (int i = 0; i < intArray.length(); i++) {
            System.out.println(intArray.get(i));
        }
        for (int i = 0; i < strArray.length(); i++) {
            System.out.println(strArray.get(i));
        }
        System.out.println("=======================");




        List<String> contentList = directoryContent.getDirectoryContent();

        // Выводим первые 5 или меньше элементов
        for (int i = 0; i < Math.min(contentList.size(), 5); i++) {
            System.out.println(contentList.get(i));
        }

        }



    }
