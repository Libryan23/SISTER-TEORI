import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apel", "Mangga", "Pisang", "Jeruk", "Anggur", "Alpukat", "Ara");

        fruits.stream()
              .filter(fruit -> fruit.startsWith("A"))
              .forEach(System.out::println);
    }
}
