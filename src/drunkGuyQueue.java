import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class drunkGuyQueue {
    private Queue<Integer> Player1 = new LinkedList<>();
    private Queue<Integer> Player2 = new LinkedList<>();

    public void SetPlayer1Qe(ArrayList<Integer> cards) {

        for (int card : cards) {
            Player1.offer(card);

        }


    }

    public void SetPlayer2Qe(ArrayList<Integer> cards) {

        for (int card : cards) {
            Player2.offer(card);

        }


    }
    public Stack<Integer> queueToStack(Queue<Integer> cards){
        Stack<Integer> stack = new Stack<>();
        for (int card : cards){
            stack.push(card);


        }
        return stack;
    }

}

