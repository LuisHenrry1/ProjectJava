package teste;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String > nome = Stream.of("Luis", "Emilly");
        nome.distinct();
    }
}
