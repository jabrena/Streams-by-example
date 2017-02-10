import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example9 {

    public static void main(String[] args) {

        final Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 };
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        listOfIntegers
                .parallelStream()
                .forEach(e -> System.out.println(Thread.currentThread() + " " + e + " "));
    }

}
