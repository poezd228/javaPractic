import java.util.*;
public class Main {
    public static void main(String[] args)  {
        String string = "";
        Integer integer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        TestClass object = new TestClass(string, integer, list);
        object.PrintClass(object);
        }
    }
