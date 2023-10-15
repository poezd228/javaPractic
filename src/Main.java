import java.util.*;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> cards1 = new ArrayList<>();
        ArrayList<Integer> cards2 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            cards1.add(input.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            cards2.add(input.nextInt());

        }
        drunkGuy DrunkGuyStack = new drunkGuy();
        DrunkGuyStack.SetPlayer1(cards1);
        DrunkGuyStack.SetPlayer2(cards2);
        DrunkGuyStack.DrunkGuyStack();


    }
}
