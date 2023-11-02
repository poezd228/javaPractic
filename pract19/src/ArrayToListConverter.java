import java.util.Arrays;
import java.util.List;
public class ArrayToListConverter {
    public <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
