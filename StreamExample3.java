import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apel", "Mangga", "Pisang", "Jeruk", "Anggur", "Alpukat", "Ara");

        List<Integer> lengths = fruits.stream()
                                      .map(String::length)
                                      .collect(Collectors.toList());

        System.out.println("Panjang karakter buah-buahan: " + lengths);
    }
}
