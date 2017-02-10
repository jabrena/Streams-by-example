import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example8 {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d","a"}, {"e", "f"}};

		Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()))
                .forEach(System.out::println);
    }

}
