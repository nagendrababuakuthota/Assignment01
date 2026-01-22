import java.util.List;
import java.util.stream.Collectors;
public class _17StreamOperations {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "apple", "orange", "banana");
        List<String> result = strings.stream().distinct().map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
