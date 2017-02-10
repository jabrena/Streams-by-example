import java.util.stream.IntStream;

public class Example4 {

    public static void main(String[] args) {

        IntStream.range(1, 4)
                .forEach(System.out::println);
    }

}
