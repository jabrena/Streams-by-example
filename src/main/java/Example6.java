import java.util.Arrays;
import java.util.stream.Stream;

public class Example6 {

    public static void main(String[] args) {

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    return s.startsWith("a");
                })
                .map(s -> {
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

}
