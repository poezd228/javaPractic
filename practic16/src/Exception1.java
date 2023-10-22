import java.util.Scanner;

public class Exception1 extends ThrowsDemo{
    public void exceptionDemo() {
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = input.next();
        try {
            i = Integer.parseInt(intString);

        } catch (NumberFormatException e) {
            System.out.println("Not integer");
        } finally {
            System.out.println(2 / i);
        }


    }
}

