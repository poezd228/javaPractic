import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class drunkGuy {
    private int count = 0;
    private Stack<Integer> Player1 = new Stack<>();
    private Stack<Integer> Player2 = new Stack<>();


    public Stack<Integer> ReverseStack(ArrayList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        Collections.reverse(list);
        for (int element : list) {
            stack.push(element);

        }
        return stack;

    }


    private Stack<Integer> addToDown(Stack<Integer> stack, int element) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < stack.size(); i++) {
            list.add(stack.pop());


        }
        list.add(element);
        return ReverseStack(list);


    }

    public void SetPlayer1(ArrayList<Integer> player1) {
        Player1 = ReverseStack(player1);

    }

    public void SetPlayer2(ArrayList<Integer> player1) {
        Player2 = ReverseStack(player1);

    }


    public void DrunkGuyStack() {
        while (true) {


            if (count == 106) {
                System.out.println("Botva");
                break;
            }

            if (Player1.peek() < Player2.peek()) {
                Player1 = addToDown(Player1, Player1.pop());
                Player1 = addToDown(Player1, Player2.pop());


                if (Player2.isEmpty()) {
                    System.out.println("first " + count);
                    break;


                }
                count += 1;

            }
            if (Player1.peek() > Player2.peek()) {
                Player2 = addToDown(Player2, Player1.pop());
                Player2 = addToDown(Player2, Player2.pop());

                if (Player1.isEmpty()) {
                    System.out.println("second " + count);
                    break;

                }
                count += 1;

            }


        }

    }
}
