
import java.util.stream.IntStream;

public class ExampleX {

    public static void main(String[] args) {

        IntStream.iterate(0, i -> ( i + 1 ) % 2)
                .parallel()
                .distinct()
                .limit(10)
                .forEach(System.out::println);
    }


}
