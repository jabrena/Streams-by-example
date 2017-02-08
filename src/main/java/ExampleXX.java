import java.util.stream.IntStream;

/**
 * Created by jabrena on 8/2/17.
 */
public class ExampleXX {

    public static void main(String[] args) {

        Object[] locks = { new Object(), new Object() };

        IntStream
                .range(1, 5)
                .parallel()
                .peek(Unchecked.intConsumer(i -> {
                    synchronized (locks[i % locks.length]) {
                        Thread.sleep(100);

                        synchronized (locks[(i + 1) % locks.length]) {
                            Thread.sleep(50);
                        }
                    }
                }))
                .forEach(System.out::println);
    }



}
