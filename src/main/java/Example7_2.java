import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7_2 {

    public static void main(String[] args) {

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    return s.startsWith("a");
                })
                .map(s -> {
                    return s.toUpperCase();
                })
                .collect(Collectors.toList())
                .stream()
                .forEach(s -> System.out.println("forEach: " + s));
    }

}
