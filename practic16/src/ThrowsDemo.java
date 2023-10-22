import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        int key = 0;
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите key");
            try {
                key = myScanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("ashibka");
            }
            break;


        }


        printDetails(key);
    }

    public void printDetails(int key) {
        String message = getDetails(key);
        System.out.println(message);

    }

    private String getDetails(int key) {
        try {
            if (key == 0) {
                throw new Error("void key");
            }

        } finally {

            return "data for " + key;
        }




    }


}

